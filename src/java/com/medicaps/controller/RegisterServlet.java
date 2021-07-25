

package com.medicaps.controller;

import com.medicaps.dao.Userdao;
import com.medicaps.dto.User;
import com.medicaps.mail.Mail;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="reg",urlPatterns={"/saveuser"})


public class RegisterServlet extends HttpServlet {

    
    Userdao dao=new Userdao();
     private int getOTP() 
    {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);    
        return number;
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
//        String ctx = getServletContext().getContextPath();
        String name=req.getParameter("uname");
        String email=req.getParameter("email");
        String pass=req.getParameter("pass");
        int type=Integer.parseInt(req.getParameter("type"));
        int branch=Integer.parseInt(req.getParameter("branch"));
      
        
        Mail ms=new Mail();
       int otp = getOTP();
       
        ms.sendVerifyMail(email, name,otp);
        User user=new User(name,email,pass,type,branch,otp);
        
       
       
       
       
       boolean status=dao.Saveuser(user);
       
       if(status)
       {
        resp.sendRedirect("verify.jsp");
           
       }
       else
       {
           resp.sendRedirect("register.jsp?res="+status);
       
       }
        
    }
}


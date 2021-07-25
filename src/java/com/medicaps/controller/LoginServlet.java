
package com.medicaps.controller;

import com.medicaps.dao.Userdao;
import com.medicaps.dto.User;
import com.mysql.cj.Session;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name="login",urlPatterns={"/loginuser"})

public class LoginServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String ctx = getServletContext().getContextPath();
    String email=req.getParameter("email");
    String pass=req.getParameter("pass");   
    
  
    Userdao dao=new Userdao();
    User user=dao.Checkuser(email,pass);
    if(user==null)
    {
    System.err.println("login failed");
    }
//    else{
//        int verify=user.getIsVerify();
//        if(verify==0)
//        {
//         resp.sendRedirect("verify.jsp");
//        }
    else
    {
    HttpSession session=req.getSession();
    session.setAttribute("Loginuser",user);
     if(user.getType()==1)
     {
      resp.sendRedirect("fachome.jsp");
     
     }
     else
     {
      resp.sendRedirect("studhome.jsp");
     }
   }
  }
 //}
}
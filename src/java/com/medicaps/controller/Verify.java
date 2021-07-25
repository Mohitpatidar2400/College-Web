
package com.medicaps.controller;

import com.medicaps.dao.Userdao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;

@WebServlet(name="verify",urlPatterns={"/verify"})
public class Verify extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   // String ctx = getServletContext().getContextPath();    
    String email=req.getParameter("email");
    String otp=req.getParameter("otp");
    
   // Userdao vdao=new Userdao();
    //vdao.verifyUser(email,otp);
    resp.sendRedirect("login.jsp");
    
    }
    
    
    
}

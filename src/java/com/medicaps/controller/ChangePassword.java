
package com.medicaps.controller;

import com.medicaps.dao.Userdao;
import com.medicaps.dto.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="changepass",urlPatterns={"/changepass"})
public class ChangePassword extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //String ctx = getServletContext().getContextPath();
    User user=(User)req.getSession().getAttribute("Loginuser");
    String oldpass=req.getParameter("oldpass");
    String newpass=req.getParameter("newpass");
    Userdao udao=new Userdao();
    udao.Changepassword(user.getUserId(), oldpass, newpass);
    resp.sendRedirect("index.jsp");
    
    }
    
    
    
}

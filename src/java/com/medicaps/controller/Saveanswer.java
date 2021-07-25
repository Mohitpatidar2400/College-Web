
package com.medicaps.controller;

import com.medicaps.dao.Answerdao;
import com.medicaps.dto.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="saveans",urlPatterns={"/saveans"})
public class Saveanswer extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //String ctx = getServletContext().getContextPath(); 
    User user=(User) req.getSession().getAttribute("Loginuser");
    
    int qid=Integer.parseInt(req.getParameter("qid"));
    String ans=req.getParameter("ans");
    
    Answerdao adao=new Answerdao();
    adao.Saveanswer(user.getUserId(), qid, ans);
    resp.sendRedirect("fachome.jsp");
    
    
    }
    
}

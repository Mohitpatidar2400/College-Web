
package com.medicaps.controller;

import com.medicaps.dao.Questiondao;
import com.medicaps.dto.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "savequs",urlPatterns = {"/sendquestion"})

public class SendQuestion extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //String ctx = getServletContext().getContextPath();  
      User user=(User)req.getSession().getAttribute("Loginuser");
      String qu=req.getParameter("qu");
      Questiondao qdao=new Questiondao();
      qdao.Savequestion(user.getUserId(),qu);
      resp.sendRedirect("studentque.jsp");
    
    
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medicaps.dao;

import com.medicaps.dto.Question;
import static java.lang.ProcessBuilder.Redirect.from;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Date.from;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author hello
 */
public class Questiondao {
    
    
    public boolean Savequestion(int uid,String qu)
    {
     try{
         Connection con=DBconnection.getconnection();
         String query="insert into question(qus,Ask_by) values(?,?)";
         PreparedStatement psu=con.prepareStatement(query);
         psu.setString(1,qu);
         psu.setInt(2,uid);
         psu.executeUpdate();
         con.close();
         return true;
     }
     catch(Exception ex)
     {
         System.err.println("Question error"+ex.getMessage());
         return false;    
     }
    }
   
    
    
    
    
    public List<Question> listquestion(int uid)
    {
     List<Question> questions=new ArrayList<>();
     try{
       Connection con=DBconnection.getconnection();
         String query="select * from question where ask_by="+uid+"";
         PreparedStatement ps=con.prepareStatement(query);
         ResultSet rs=ps.executeQuery();
         while(rs.next())
         { 
          int qid=rs.getInt("qid");
          String qus=rs.getString("qus");
          String qdate=rs.getString("qus_date");
          int student=rs.getInt("ask_by");
          Question q=new Question(qid,qus,qdate,student);
          questions.add(q);
          }
         con.close();
     
     }
     catch(Exception ex)
     {
         System.err.println("save question error"+ex.getMessage());
     }
     return questions;
    
    }
    
    public String getQuestionname(int qid)
    {
     try{
         Connection con=DBconnection.getconnection();
         String query="select qus from question where qid=?";
         PreparedStatement qps=con.prepareStatement(query);
         qps.setInt(1, qid);
         ResultSet rs=qps.executeQuery();
         while(rs.next())
         {
          String qus=rs.getString("qus");
          return qus;
         }
     
        con.close();
     }
     catch(Exception ex)
     {
         System.err.println("Question Error"+ex.getMessage());
     
     }
    
     return "question not found !";
    }
 
    public List<Question> listquestionbybranch(int branch)
    {
     List<Question> questions=new ArrayList<>();
     {
         try{
            Connection con=DBconnection.getconnection();
            String query = "select qid,qus,qus_date,name from "
                    + "question,user where ask_by in "
                    + "(select uid from user where branch=? and type=2) "
                    + "and question.ask_by=user.uid "
                    + "order by qid DESC";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,branch);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
             int qid=rs.getInt("qid");
             String qus=rs.getString("qus");
             String qdate=rs.getString("qus_date");
             String student=rs.getString("name");
             
             Question q=new Question(qid,qus,qdate,student);
             
             questions.add(q);
            }
            
           
                        
             con.close();
       
       }
         
         catch(Exception ex)
         {
             System.err.println(" question by branch error"+ex.getMessage());
         }
         return questions;
         
     }
    
    }
    
    
    
    
    
    
    
}

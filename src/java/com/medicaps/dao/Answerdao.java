
package com.medicaps.dao;

import com.medicaps.dto.Answer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Answerdao {
    
    public boolean Saveanswer(int uid,int qid,String ans)
    {
     try{
     
         Connection con=DBconnection.getconnection();
         String query="insert into answer(ans,qus,ans_by) values(?,?,?)";
         PreparedStatement pss=con.prepareStatement(query);
         pss.setString(1, ans);
         pss.setInt(2, qid);
         pss.setInt(3, uid);
         pss.executeUpdate();
         con.close();
         return true;
         
     
     }
     catch(Exception ex){
         System.err.println("Save Answer Error"+ex.getMessage());
         return false;
     }
    
    }
   
    public List<Answer> listanswer(int qid)
    {
      List<Answer> answers=new ArrayList<>();
      try{
          
          Connection con=DBconnection.getconnection();
          String query="select aid,ans,ans_date,name from answer,user "
                    + "where qus=? and answer.ans_by=user.uid order by aid DESC";
          PreparedStatement psq=con.prepareStatement(query);
          psq.setInt(1,qid);
          ResultSet rs=psq.executeQuery();
          while(rs.next())
          {
           int aid=rs.getInt("aid");
           String ans=rs.getString("ans");
           String date=rs.getString("ans_date");
           String faculty=rs.getString("name");
           
           Answer an=new Answer(aid,ans,date);
           an.setFacultyName(faculty);
           answers.add(an);
          
          } 
          con.close();
          
      }
      catch(Exception ex){
      
          System.err.println("View Answer Error"+ex.getMessage());
      }
      return answers;
    }
    
    
}

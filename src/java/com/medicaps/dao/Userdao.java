

package com.medicaps.dao;

import com.medicaps.dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Userdao {
    
    public boolean Saveuser(User user) 
    {
        try
        {
            
    Connection con=DBconnection.getconnection();
    PreparedStatement saveuserps=con.prepareStatement("insert into user(name,mail,password,type,branch,otp) values(?,?,?,?,?,?)");
    saveuserps.setString(1,user.getName());
    saveuserps.setString(2,user.getMail());
    saveuserps.setString(3,user.getPassword());
    saveuserps.setInt(4,user.getType());
    saveuserps.setInt(5,user.getBranch());
    saveuserps.setInt(6,user.getOtp());
    
    saveuserps.executeUpdate();
    con.close();
    return true;
    
    }   catch (Exception ex) {
        
            System.err.println("save user error"+ex.getMessage());
            return false;   
    }
        
    }

    public User Checkuser(String email,String pass)
    {
        User user=null;
        try{

            Connection con=DBconnection.getconnection();
          String query="select * from user where mail=? and password=?";
          PreparedStatement ps=con.prepareStatement(query);
          ps.setString(1, email);
          ps.setString(2, pass);
          
          ResultSet rs=ps.executeQuery();
          if(rs.next())
          {
           int uid=rs.getInt("uid");
           String  name=rs.getString("name");
           String mail=rs.getString("mail");
           String phone=rs.getString("phone");
           int type=rs.getInt("type");
           int branch=rs.getInt("branch");
           int isVerify=rs.getInt("isVerify");
           
            user=new User(uid,name,mail,phone,type,branch,isVerify);
          
          }
          con.close();
         }
     catch(Exception ex)
     {
      System.err.println("Login Error"+ex.getMessage());
     
     
     }
    return user;
    }

    public List<User> listfaculty()
    {
     List<User> users=new ArrayList();
     try
     {
     Connection con=DBconnection.getconnection();
     String query="Select * from user where type=1 ";
     PreparedStatement pls=con.prepareStatement(query);
     ResultSet rs=pls.executeQuery();
     while(rs.next())
     {
      int uid=rs.getInt("uid");
      String name=rs.getString("name");
      String mail=rs.getString("mail");
      String phone=rs.getString("phone");
      int branch=rs.getInt("branch");      
   
       User user=new User(uid,name,mail,phone,branch);     
       users.add(user);    
     }
     
     con.close();
     
     
     
     }
    
     catch(Exception ex)
     {
     System.err.println(" Faculty err "+ex.getMessage());
     }
        return users;
    }

  public boolean Updateuser(User usr)
  {
   try{
       Connection con=DBconnection.getconnection();
       String query="update user set name=?,mail=?,phone=? where uid=?";
       PreparedStatement pus=con.prepareStatement(query);
       pus.setString(1,usr.getName());
       pus.setString(2,usr.getMail());
       pus.setString(3,usr.getPhone());
       pus.setInt(4,usr.getUserId());
       pus.executeUpdate();
       con.close();
       return true;  
    }
   catch(ClassNotFoundException ex)
   {
       System.err.println("Update user error"+ex.getMessage());
       return false;  
   }
   catch(SQLException ex)
   {
       System.err.println("Update user error"+ex.getMessage());
       return false; 
   }
    
  }

  public boolean Changepassword(int uid,String oldpass,String newpass)
  {
   try{
       Connection con=DBconnection.getconnection();
       String query="update user set password=? where uid=? and password=?";
       PreparedStatement ups=con.prepareStatement(query);
       ups.setString(1,newpass);
       ups.setInt(2, uid);
       ups.setString(3,oldpass);
       ups.executeUpdate();
       con.close();
       return true;
    }
   catch(Exception ex)
   {
       System.err.println("Change Password Error"+ex.getMessage());
       return false;
   }
  
  }
  
public void verifyUser(String email, String otp) 
    {
        try 
        {
            Connection con=DBconnection.getconnection();
            PreparedStatement ps = con.prepareStatement("update user set isVerify=1 where mail=?");
            ps.setString(1, email);
            ps.setInt(2, Integer.parseInt(otp));
            
            
            ps.executeUpdate();
            con.close();
            
            
        } catch (Exception ex) 
        {
            System.err.println("verify password : "+ex.getMessage());
            
        }
    }
    
   }


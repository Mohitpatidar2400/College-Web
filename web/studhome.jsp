
<%@page import="java.util.List"%>
<%@page import="com.medicaps.dto.User"%>
<%@page import="com.medicaps.dao.Userdao"%>
<%@include file="blocks/studheader.jsp" %>
    
<% 
 Userdao udao=new Userdao();
 List<User> users=udao.listfaculty();
 
 User luser=(User)session.getAttribute("Loginuser");
 String name=luser.getName();




%>

   <div class="tm-right-column">
    <figure>
        
        <img src="asset/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>

       
        <div class="tm-content-div">
        <section id="welcome" class="tm-section">
       <h1> Welcome <%=name%> !!</h1>
       <hr>
        
       <% 
        if(users.size()>0)
        {
       %>
       
        <table class="table table-hover">
            <tr>
                <th> Name </th>
                <th> Mail </th>
                <th> Phone </th>
                <th> Branch</th>
                
              </tr>
                   
        <%
          for (User user:users)
          {
        %>
        <tr>
            <th><%=user.getName()%></th>
            <th><%=user.getMail()%></th>
            <th><%=user.getPhone()%></th>         
            <th><%=user.getBranch()%></th>
        </tr>
        <%
         }
        %>
        <% }
          else
          {

             out.println("<h2>No Faculty Registered Till Now</h2>");
           }
        %>
          </table>
       
         
        </section>
        
        <%@include  file="blocks/footer.jsp" %>   
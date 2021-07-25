

<%@page import="com.medicaps.dto.User"%>
<%@include file="blocks/facheader.jsp"%>



<%
 User user=(User)session.getAttribute("Loginuser");
%>
 <div class="tm-right-column">
    <figure>
        
        <img src="asset/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>

        <div class="tm-content-div">

                         
    <h1>Update User</h1>
    <hr>
    <form action="update" method="post">
        <input type="text" value="<%=user.getName()%>" class='form-control' name="uname" placeholder="Your Name"  required>
        <br>
        <input type="email" value="<%=user.getMail()%>" class='form-control' name="email"  placeholder="Your Email"  required>
        <br>
        <input type="text" value="<%=user.getPhone()%>" class='form-control'  name="phone"  placeholder="Your Phone"  >
        <br>
        <button type="submit" class='btn btn-info'>Update User</button>
        
    </form>
        <br><hr>
        
   
        
        <%@include file="blocks/footer.jsp" %>

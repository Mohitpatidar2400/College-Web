
<%@include file="blocks/header.jsp" %>
<!DOCTYPE html>
<div class="tm-right-column">
    <figure>
        <img src="asset/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>

    <div class="tm-content-div">
        
        <h1> User Login </h1>
        <hr>
        <form action="loginuser" method="post"> 
        <input type="email" placeholder="Your Email" class="form-control" name="email" required>
        <br>
        <input type="password" placeholder="Your Password" class="form-control" name="pass" required>
        <br>
        <button type="submit" class="btn btn-info">Submit</button>
        <br><br>
        </form>
        <hr>
<%@include file="blocks/footer.jsp"  %>

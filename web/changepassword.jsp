<%@include file="blocks/studheader.jsp" %>
                    
<div class="tm-right-column">
    <figure>
        <img src="assets/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>

    <div class="tm-content-div">
                            <!-- Welcome section -->
                            <h1>Change Password</h1>
      <hr>
      <form action="changepass" method="post">
            <input type="password" class='form-control' placeholder="Old Password" name='oldpass' required>
            <br>
            <br>
            <input type="password" class='form-control' placeholder="New Password" name='newpass' required>
            <br>
            <br>
            <button type="submit" class="btn btn-info">Change Password</button>
          
      </form>
          <br>
       <hr>
       
  
       
      <%@include file="blocks/footer.jsp" %>


<%@include file="blocks/header.jsp" %>




   <div class="tm-right-column">
    <figure>
        
        <img src="asset/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>

        <div class="tm-content-div">
       
    
                                   <h1>Register</h1>
        <hr>
        <form action="saveuser" method="POST">
         <input type="text" name="uname" placeholder="your name" class="form-control" required> 
         <br>
         <input type="email" name="email" placeholder="your email" class="form-control" required>
         <br>
         <input type="password" name="pass" placeholder="your password" class="form-control" required> 
         <br>
         <input type="password" placeholder="confirm password" class="form-control" required> 
         <br>
    
         <select name="branch" class="form-control" required>
              <option value="">choose branch</option>
              <option value="1">Computer Science</option>
              <option value="2">Information Technology</option>
              <option value="3">Mechanical</option>
              
          </select>
          <br>
          
          <select name="type" class="form-control" required>
              <option value="">choose type</option>
              <option value="1">Faculty</option>
              <option value="2">Student</option>
              
          </select>
          <br><br>
          <button type="submit" class="btn btn-info">Register</button>
          </form>
        <br><hr>
                                
        <%@include  file="blocks/footer.jsp" %>               
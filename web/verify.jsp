<%@include file="blocks/header.jsp" %>
                    
<div class="tm-right-column">
    <figure>
        <img src="asset/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>

    <div class="tm-content-div">
                            <!-- Welcome section -->
                            <h1>User Verify</h1>
                            <hr>
                            <form action="verify" method="post">
                                <input type="email" name="email" class="form-control" placeholder="Your Email" required>
                                <br>
                                <input type="password" name="otp" class="form-control" placeholder="Your OTP" required>
                                <br>
                                <button type="submit" class="btn btn-info">Verify</button>
                              
                            </form>
                            
                            <br>
                            <hr>
                                
                           <%@include file="blocks/footer.jsp" %>
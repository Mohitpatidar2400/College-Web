<%@include file="blocks/header.jsp" %>
  <div class="tm-right-column">
    <figure>
    <img src="asset/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>
       <div class="tm-content-div">
           
       
                            <!-- Welcome section -->
                               <!-- Contact Us section -->
                            <br>
                               <section id="contact" class="tm-section">
                                <header><h2 class="tm-blue-text tm-section-title tm-margin-b-30">Contact Us</h2></header>

                                <div class="row">
                                    <div class="col-lg-6">
                                        <form action="#contact" method="post" class="contact-form">
                                            <div class="form-group">
                                                <input type="text" id="contact_name" name="contact_name" class="form-control" placeholder="Name"  required/>
                                            </div>
                                            <div class="form-group">
                                                <input type="email" id="contact_email" name="contact_email" class="form-control" placeholder="Email"  required/>
                                            </div>
                                            <div class="form-group">
                                                <textarea id="contact_message" name="contact_message" class="form-control" rows="9" placeholder="Message" required></textarea>
                                            </div>                                            
                                            <button type="submit" class="float-right tm-button">Send</button>
                                        </form>    
                                    </div>
                                    
                                    <div class="col-lg-6 tm-contact-right">
                                        <p>
                                           
                                        </p>
                                        <address>
                                            <br>
                                            Medicaps University Indore M.P<br>
                                        
                                        </address>
                                    </div>
                                </div>
                                
                            </section>

                            <%@include file="blocks/footer.jsp" %>
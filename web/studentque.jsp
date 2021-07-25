<%@page import="com.medicaps.dto.Question"%>
<%@page import="java.util.List"%>
<%@page import="com.medicaps.dto.User"%>
<%@page import="com.medicaps.dao.Questiondao"%>
<%@include file="blocks/studheader.jsp" %>
<%
 User user=(User)session.getAttribute("Loginuser");
 Questiondao qdao=new Questiondao();
 List<Question> list=qdao.listquestion(user.getUserId());

%>
<div class="tm-right-column">
    <figure>
        <img src="asset/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>

    <div class="tm-content-div">    
    <section id="welcome" class="tm-section">
        <h1>Ask Question ?</h1>
        <hr>
        <form action="sendquestion" method="post">
            
            <textarea  name="qu" class="form-control" cols="25" rows="5" required>  </textarea>
            <br>
            <button type="submit" class="btn btn-success">Send Question </button>
        </form>
        
        
        <hr>
        <h1> Old Asked Questions</h1>
        <table class="table table-hover">
            <tr>
                <th>Question</th>
                <th>Question Date</th>
            </tr>
            
      
        
        <%
          for(Question qu:list)
          {
        %>
        <tr>
            <th><%=qu.getQus()%></th>
            <th><%=qu.getQdate()%></th>
             <th>
                    <a href="viewanswer.jsp?qus=<%=qu.getQid()%>"><b class='btn btn-info'>View</b></a>
                </th>
        </tr>
        <% } %>
        
          </table>
    </section>
        
        
        
        <%@include file="blocks/footer.jsp" %>
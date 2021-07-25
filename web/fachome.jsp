

<%@page import="java.util.List"%>
<%@page import="com.medicaps.dto.Question"%>
<%@page import="com.medicaps.dao.Questiondao"%>
<%@page import="com.medicaps.dto.User"%>
<%@include file="blocks/facheader.jsp" %>

<%
   User user=(User)session.getAttribute("Loginuser");
   String name=user.getName();
   int branch =user.getBranch();
   Questiondao qdao=new Questiondao();
   List<Question> list=qdao.listquestionbybranch(branch);
  

%>



<div class="tm-right-column">
    <figure>
        <img src="asset/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>

    <div class="tm-content-div">    
    <section id="welcome" class="tm-section">
        <h1>Welcome <%=name%> Ji !!</h1>
        
  <hr>
  <h1>
       Student Questions
  </h1>
  <table class="table table-hover">
      <tr>
          <th>Student Name </th>
          <th>Question </th>
          <th>Question Date </th>
          <th>Give Answer</th>
      </tr>
      <%
       for(Question qu:list)
       {
      
      %>
      <tr>
          <td><%=qu.getStudentname()%></td>
          <td><%=qu.getQus()%></td>
          <td><%=qu.getQdate()%></td>
           <td>
                    <form action="saveans" method="post">
                        <input type="hidden" name='qid' value='<%=qu.getQid()%>'>
                        <textarea cols="25" rows="1" name="ans" required></textarea>
                        <br><br>
                        <button type="submit" class='btn btn-warning'>Send</button>
                    </form>
                </td>
      </tr>
      <%
      }
      %>
      
  </table>




    </section>
      
      
      
      

<%@include file="blocks/footer.jsp" %>
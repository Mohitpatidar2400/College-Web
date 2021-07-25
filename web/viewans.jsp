
<%@page import="com.medicaps.dao.Questiondao"%>
<%@page import="com.medicaps.dto.Answer"%>
<%@page import="com.medicaps.dao.Answerdao"%>
<%@page import="java.util.List"%>
<%@include file="blocks/studheader.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
  int qid=Integer.parseInt(request.getParameter("q"));
  Questiondao qdao=new Questiondao();
   String qusname=qdao.getQuestionname(qid);
  List<Answer> list= new Answerdao().listanswer(qid);

%>

<div class="tm-right-column">
    <figure>
        <img src="asset/img/medicap.jpg" alt="Header image" class="img-fluid">    
    </figure>

    <div class="tm-content-div">    
    <section id="welcome" class="tm-section">
        <h1>Question :<%=qusname%></h1>
        <hr>
        <table class="table table-hover">
            <tr>
                <th> Answer</th>
                <th> Answer Date</th>
                <th> Faculty Name</th>
            </tr>
            <%
             for(Answer a:list)
             {
            %>
            <tr>
                <th><%=a.getAns()%></th>
                <th><%=a.getAnsDate()%></th>
                <th><%=a.getFacultyName()%></th>
                
            </tr>
            <%
            }%>
        </table>
    </section>
        
         </div>
</div>
        
        <%@include file="blocks/footer.jsp" %>

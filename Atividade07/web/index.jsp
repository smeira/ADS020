<%-- 
    Document   : index
    Created on : 28/10/2019, 10:43:59
    Author     : 18114290023
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.Date"%>
<%@page errorPage="erro.jsp"%>
<!DOCTYPE html>     
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp"%>

        <%String msg = "Olá Mundo!";%>
        <h1>
            <%=msg%>
        </h1>
        <% Date data = new Date();%>
        <p>
            <%=data%>
        </p>

        

        <jsp:useBean id="aluno" class="beans.Aluno"/>
        <jsp:setProperty name="aluno" property="matricula" value="2016100"/>
        <jsp:setProperty name="aluno" property="nome" value="JOSE"/>
        <p>    
            <jsp:getProperty name="aluno" property="matricula"/> 
            <jsp:getProperty name="aluno" property="nome"/>
        </p>

        <%@include file="rodape.jsp"%>


    </body>
</html>

<%@ page import="com.example.santander.model.ContaModel" %>
<%@ page import="com.example.santander.model.ListaContas" %>
<%@ page import="java.util.List" %><%
    List<ContaModel> contas = (List)request.getAttribute("contas");
    ContaModel contaModel = (ContaModel)request.getAttribute("conta");
    String title = (String) request.getAttribute("title");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contas</title>
    <style>table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
    }</style>
</head>
<body>
<h1><%= title %></h1>
<br>
<%
    if(contas != null && !contas.isEmpty()){
%>
<table>
    <tr>
    <th>Nome</th>
    <th>Email</th>
    <th>Agência</th>
    <th>Conta</th>
    </tr>
    <%
        for(ContaModel conta: contas){
    %>
    <tr>
    <td><%= conta.getNome()%></td>
    <td><%= conta.getEmail()%></td>
    <td><%= conta.getAgencia().toString()%></td>
    <td><%= conta.getConta().toString() %></td>
    </tr>
    <%
        }
    %>
</table>
<br>
<%
    } else if(contaModel != null){
%>
<h2><%= contaModel.getNome()%></h2>
<h2><%= contaModel.getEmail()%></h2>
<h2><%= contaModel.getAgencia().toString()%></h2>
<h2><%= contaModel.getConta().toString() %></h2>
<br>
<a href="/Gradle___com_example___santander_1_0_SNAPSHOT_war/conta">Ver Contas</a>
<br>
<%
    }
%>
<a href="/Gradle___com_example___santander_1_0_SNAPSHOT_war/cadastra-conta">Cadastrar Nova Conta</a>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Samsung
  Date: 20/02/2022
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nova Conta</title>
</head>
<body>
<h1>Nova Conta</h1><br>
<form action="conta" method="post">
    <input type="text" placeholder="Nome" name="nome">
    <input type="text" placeholder="Email" name="email">
    <input type="number" placeholder="Agencia" name="agencia">
    <input type="number" placeholder="Conta" name="conta">
    <input type="submit"/>
</form>
<br>
<a href="/Gradle___com_example___santander_1_0_SNAPSHOT_war/conta">Ver Contas</a>
</body>
</html>

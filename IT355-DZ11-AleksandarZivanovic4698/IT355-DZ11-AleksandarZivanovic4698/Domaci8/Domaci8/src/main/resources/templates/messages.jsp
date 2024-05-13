<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Poruke</title>
</head>
<body>
<h1>Primljene poruke</h1>
<ul>
    <c:forEach var="message" items="${messages}">
        <li>${message}</li>
    </c:forEach>
</ul>
</body>
</html>
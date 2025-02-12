<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Список ролей</title>
</head>
<body>
<jsp:include page="/jspf/header.jsp" />
<h1>Список ролей</h1>
<a href="/JavaLabEE">Назад</a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Название</th>
        <th>Может редактировать фильмы</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="role" items="${roles}">
        <tr>
            <td>${role.id}</td>
            <td>${role.name}</td>
            <td>${role.canEditMovies ? "Да" : "Нет"}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<jsp:include page="/jspf/footer.jsp" />
</body>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }
    th {
        background-color: #f2f2f2;
    }
</style>
</html>

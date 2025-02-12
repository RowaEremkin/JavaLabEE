<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Список фильмов</title>
</head>
<body>
<jsp:include page="/jspf/header.jsp" />
<h1>Список фильмов</h1>
<a href="/JavaLabEE">Назад</a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Название</th>
        <th>Жанр</th>
        <th>Год выпуска</th>
        <th>Описание</th>
        <th>Добавил</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="movie" items="${movies}">
        <tr>
            <td>${movie.id}</td>
            <td>${movie.title}</td>
            <td>${movie.genre}</td>
            <td>${movie.releaseYear}</td>
            <td>${movie.description}</td>
            <td>${movie.addedBy.firstName} ${movie.addedBy.lastName}</td> <%-- Предполагается, что у User есть firstName и lastName --%>
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

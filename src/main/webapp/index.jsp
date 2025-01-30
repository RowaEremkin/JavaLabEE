<%@page language="java" contentType="text/html"
        pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
<head>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Каталог фильмов</title>
</head>
<body>
<jsp:include page="jspf/header.jsp" />
<div id="main">
    <h1>Добро пожаловать в каталог фильмов!</h1>
    <h2>Популярные фильмы</h2>
    <div class="movie-list">
        <div class="movie-item">
            <img src="images/movie1.jpg" alt="Название фильма 1" class="movie-poster">
            <h3>Название фильма 1</h3>
            <p>Краткое описание фильма 1. Этот фильм рассказывает о...</p>
            <a href="#" class="btn">Смотреть</a>
        </div>
        <div class="movie-item">
            <img src="images/movie2.jpg" alt="Название фильма 2" class="movie-poster">
            <h3>Название фильма 2</h3>
            <p>Краткое описание фильма 2. Этот фильм рассказывает о...</p>
            <a href="#" class="btn">Смотреть</a>
        </div>
        <div class="movie-item">
            <img src="images/movie3.jpg" alt="Название фильма 3" class="movie-poster">
            <h3>Название фильма 3</h3>
            <p>Краткое описание фильма 3. Этот фильм рассказывает о...</p>
            <a href="#" class="btn">Смотреть</a>
        </div>
    </div>
</div>
<jsp:include page="jspf/footer.jsp" />
</body>
</html>

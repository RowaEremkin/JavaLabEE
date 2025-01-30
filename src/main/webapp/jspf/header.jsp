<%@ page language="java" contentType="text/html"
         pageEncoding="UTF-8"%>
<header>
    <a href="/"><img alt="Логотип" id="top-image" src="images/logo.png"></a> <!-- Убедитесь, что путь к логотипу правильный -->
    <div id="user-panel">
        <h1>Каталог фильмов</h1>
        <nav>
            <ul>
                <li><a href="/catalog">Каталог фильмов</a></li>
                <li><a href="/about">О нас</a></li>
                <li><a href="/contact">Контакты</a></li>
            </ul>
        </nav>
    </div>
</header>

<style>
    /* Стили для заголовка */
    header {
        background-color: #333; /* Темный фон для заголовка */
        color: white; /* Белый текст */
        padding: 20px;
        display: flex;
        align-items: center;
        justify-content: space-between; /* Распределяем пространство между элементами */
    }

    #top-image {
        height: 60px; /* Высота логотипа */
    }

    #user-panel {
        display: flex;
        flex-direction: column; /* Вертикальное расположение элементов */
        align-items: flex-start; /* Выравнивание по левому краю */
    }

    nav ul {
        list-style-type: none; /* Убираем маркеры списка */
        padding: 0; /* Убираем отступы */
        margin: 0; /* Убираем внешние отступы */
    }

    nav ul li {
        display: inline; /* Горизонтальное расположение ссылок */
        margin-right: 15px; /* Отступ между ссылками */
    }

    nav ul li a {
        color: white; /* Цвет ссылок */
        text-decoration: none; /* Убираем подчеркивание */
    }

    nav ul li a:hover {
        text-decoration: underline; /* Подчеркивание при наведении */
    }
</style>

<%@ page language="java" contentType="text/html"
         pageEncoding="UTF-8"%>
<header>
    <a href="/">
        <img alt="Логотип" id="top-image" src="images/logo.jpg">
    </a>
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
    header {
        background-color: #333;
        color: white;
        padding: 20px;
        display: flex;
        align-items: center;
        justify-content: space-between;
    }

    #top-image {
        height: 5rem;
        width: 5rem;
    }

    #user-panel {
        display: flex;
        flex-direction: column;
        align-items: flex-start;
    }

    header nav ul {
        list-style-type: none;
        padding: 0;
        margin: 0;
    }

    header nav ul li {
        display: inline;
        margin-right: 15px;
    }

    header nav ul li a {
        color: white;
        text-decoration: none;
    }

    header nav ul li a:hover {
        text-decoration: underline;
    }
</style>

package com.rowa.javalabee;

import com.rowa.javalabee.models.Movie;
import com.rowa.javalabee.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="movies",value="/movies")
public class MovieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Movie> movies = getMovies();
        request.setAttribute("movies", movies);

        request.getRequestDispatcher("view/movie.jsp").forward(request, response);
    }
    public static List<Movie> getMovies() {
        List<User> users = UserServlet.getUsers();
        User user1 = users.get(0);
        User user2 = users.get(1);
        User user3 = users.get(2);

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1L,"Побег из Шоушенка", user1, "Драма", 1994, "История о надежде и выживании в тюрьме."));
        movies.add(new Movie(2L,"Криминальное чтиво", user2, "Криминал", 1994, "Культовый фильм с нелинейным повествованием."));
        movies.add(new Movie(3L,"Темный рыцарь", user3, "Супергероика", 2008, "Бэтмен против Джокера."));
        movies.add(new Movie(4L,"Список Шиндлера", user1, "История", 1993, "История спасения евреев во время Холокоста."));
        movies.add(new Movie(5L,"Властелин колец: Возвращение короля", user2, "Фэнтези", 2003, "Финальная битва за Средиземье."));
        movies.add(new Movie(6L,"Начало", user3, "Научная фантастика", 2010, "Внедрение идей в сны."));
        movies.add(new Movie(7L,"Форрест Гамп", user1, "Драма", 1994, "Жизнь простого человека, свидетеля исторических событий."));
        movies.add(new Movie(8L,"Матрица", user2, "Научная фантастика", 1999, "Реальность - это симуляция."));
        movies.add(new Movie(9L,"Интерстеллар", user3, "Научная фантастика", 2014, "Путешествие сквозь космос в поисках нового дома."));
        movies.add(new Movie(10L,"Молчание ягнят", user1, "Триллер", 1991, "Кларисса Старлинг ищет помощи у Ганнибала Лектера."));
        return movies;
    }
}

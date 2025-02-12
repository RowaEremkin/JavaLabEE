package com.rowa.javalabee;

import com.rowa.javalabee.models.Movie;
import com.rowa.javalabee.models.Role;
import com.rowa.javalabee.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="users",value="/users")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = getUsers();

        request.setAttribute("users", users);

        request.getRequestDispatcher("/view/user.jsp").forward(request, response);
    }
    public static List<User> getUsers(){
        List<Role> roles = RoleServlet.getRoles();
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Иван", "Иванов", "+79123456789", "ivan.ivanov@example.com", roles.get(0)));
        users.add(new User(2L,"Мария", "Петрова", "+79234567890", "maria.petrova@example.com", roles.get(1)));
        users.add(new User(3L,"Сергей", "Сидоров", "+79345678901", "sergey.sidorov@example.com", roles.get(2)));
        return users;
    }
}

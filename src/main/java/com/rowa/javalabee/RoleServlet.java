package com.rowa.javalabee;

import com.rowa.javalabee.models.Role;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "roles", value = "/roles")
public class RoleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Role> roles = getRoles();

        request.setAttribute("roles", roles);

        request.getRequestDispatcher("/view/role.jsp").forward(request, response);
    }

    public static List<Role> getRoles(){
        List<Role> roles = new ArrayList<>();
        roles.add(new Role(1L, "Администратор", true));
        roles.add(new Role(2L, "Редактор", true));
        roles.add(new Role(3L, "Просмотрщик", false));
        return roles;
    }
}

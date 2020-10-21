package com.fruits.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fruits.model.User;
import com.fruits.service.UserService;
import com.fruits.service.impl.UserServiceImpl;

/**
 * Servlet implementation class EditUserServlet
 */
@WebServlet("/editUser")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public EditUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/views/admin/edit.jsp");  
		int id = Integer.parseInt(request.getParameter("id"));
        UserService userService = new UserServiceImpl();
        User user = userService.getUserById(id);
        request.setAttribute("user", user);
		rd.forward(request, response);  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
        String email = request.getParameter("email");
        String fullname = request.getParameter("fullname");
        User user = new User();
        user.setId(id);
        user.setFullname(fullname);
        user.setEmail(email);
        UserService userService = new UserServiceImpl();
        userService.updateUser(user);
        response.sendRedirect("admin");
	}

}

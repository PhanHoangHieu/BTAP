package com.fruits.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fruits.model.User;
import com.fruits.service.impl.UserServiceImpl;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/views/login.jsp");  
        rd.forward(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
        String password = request.getParameter("password");

        com.fruits.service.UserService service = new UserServiceImpl();
        User user = service.getUserByNameAndPass(userName, password) ;
        HttpSession session = request.getSession();
        if (service.checkLogin(user)) {
        	session.setAttribute("role", user.getRole());
        	//session.setAttribute("userBean", user);
            if (service.isAdmin(user.getRole())) {
                    response.sendRedirect("admin");
            } else {
                    response.sendRedirect("home");
            }
        } else {
                response.sendRedirect("login?err=1");
        }
	}

}

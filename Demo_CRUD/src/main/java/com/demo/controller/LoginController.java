/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.model.User;
import com.demo.user_services.UserServices;
import com.demo.user_services_impl.UserServicesImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThanhNguyen
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user");
        String password = req.getParameter("password");
        UserServices userServices = new UserServicesImpl();
        int roleUser= userServices.getRoleUser(username, password);
        User user = new User();
        user.setUsername(username);
        boolean check=userServices.checkLogin(username, password);
        if(check){          
            req.getSession().setAttribute("ObjectUser",user);
            req.getSession().setAttribute("roleUser", roleUser);
            getServletContext().getRequestDispatcher("/CheckFilterController").forward(req, resp);
        }
        else{
            resp.sendRedirect("LoginController");
        }
    }
    
}

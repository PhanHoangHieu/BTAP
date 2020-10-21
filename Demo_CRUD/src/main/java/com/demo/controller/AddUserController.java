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
@WebServlet("/addUserController")
public class AddUserController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.sendRedirect("addUser.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user");
        String pass = req.getParameter("password");
        String address = req.getParameter("address");
        User user = new User();
        user.setUsername(username);
        user.setPassword(pass);
        user.setAddress(address);
        UserServices userServices = new UserServicesImpl();
        userServices.addUser(user);
        getServletContext().getRequestDispatcher("/GetAllUser").forward(req, resp);
    }
    
}

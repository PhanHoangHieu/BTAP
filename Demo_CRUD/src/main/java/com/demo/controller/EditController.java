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

@WebServlet("/EditController")
public class EditController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        UserServices userServices = new UserServicesImpl();
        User user = userServices.getById(id);
        req.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/editUser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String username = req.getParameter("user");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        User user = new User();
        user.setUser_id(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress(address);
        UserServices userServices = new UserServicesImpl();
        userServices.updateUser(user);
        resp.sendRedirect("GetAllUser");
    }
    
}

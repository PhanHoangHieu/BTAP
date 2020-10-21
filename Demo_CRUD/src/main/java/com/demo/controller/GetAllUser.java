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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThanhNguyen
 */
@WebServlet("/GetAllUser")
public class GetAllUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserServices userServices = new UserServicesImpl();
        List<User> lists = userServices.getAllUser();
        req.setAttribute("listUsers", lists);
        getServletContext().getRequestDispatcher("/listUser.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserServices userServices = new UserServicesImpl();
        List<User> lists = userServices.getAllUser();
        req.setAttribute("listUsers", lists);
        getServletContext().getRequestDispatcher("/listUser.jsp").forward(req, resp);
    }

}

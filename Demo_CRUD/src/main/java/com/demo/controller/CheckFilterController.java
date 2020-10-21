/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

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
@WebServlet("/CheckFilterController")
public class CheckFilterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int role = (int) req.getSession().getAttribute("roleUser");
        if(role ==1){
            resp.sendRedirect("GetAllUser");
        }else{
            getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }

}

package com.hw.homework.controller.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout.do")
public class logoutController extends HttpServlet {
    protected void doGet (HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.getSession().invalidate();

        res.sendRedirect("/");
    }
}

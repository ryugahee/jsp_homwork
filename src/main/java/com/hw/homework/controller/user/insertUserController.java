package com.hw.homework.controller.user;

import com.hw.homework.DAO.UserDAO;
import com.hw.homework.DTO.UserDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insertUser.do")
public class insertUserController extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/insertUser.jsp").forward(req, res);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // 한글 인코딩
        req.setCharacterEncoding("UTF-8");
        // 사용자 입력 정보 추출 (name 파라미터)
        String id = req.getParameter("id");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String role = req.getParameter("role");
        System.out.println(1);
        // DB 연동
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setPassword(password);
        userDTO.setName(name);
        userDTO.setRole(role);
        System.out.println("2");
        UserDAO userDAO = new UserDAO();
        userDAO.insertUser(userDTO);
        System.out.println("3");
        res.sendRedirect("/board.do");
    }
}

package com.hw.homework.controller.user;

import com.hw.homework.DAO.UserDAO;
import com.hw.homework.DTO.UserDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login.do")
public class loginController extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String id = req.getParameter("id");
        String password = req.getParameter("password");

        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);

        UserDAO userDAO = new UserDAO();
        UserDTO userDTO1 = userDAO.selectUser(userDTO);

        // 응답 화면 구성
        if(userDTO1 != null) {
            if(userDTO1.getId().equals(id) && userDTO1.getPassword().equals(password)) {
                req.getSession().setAttribute("userDTO1", userDTO1);  // 세션에 사용자 정보 저장
                res.sendRedirect("/board.do");
                System.out.println("1");

            } else {
                req.setAttribute("error", "아이디 또는 비밀번호가 일치하지 않습니다.");
                req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
                System.out.println("2");
            }
        } else {
            req.setAttribute("error", "존재하지 않는 아이디입니다.");
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
            System.out.println("3");
        }
    }
}

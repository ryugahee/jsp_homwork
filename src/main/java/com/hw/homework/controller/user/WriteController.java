package com.hw.homework.controller.user;

import com.hw.homework.DAO.WriterDAO;
import com.hw.homework.DTO.WriterDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

@WebServlet("/write.do")
public class WriteController extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.getRequestDispatcher("/write.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        // 한글 인코딩
        req.setCharacterEncoding("UTF-8");
        // 사용자 입력 정보 추출
        String writer = req.getParameter("writer");
        String content = req.getParameter("content");
       // DB 연동
       WriterDTO writerDTO = new WriterDTO();
       writerDTO.setWriter(writer);
       writerDTO.setContent(content);

       WriterDAO writerDAO = new WriterDAO();
       writerDAO.insertWriter(writerDTO);


//       req.setAttribute("writerDAO", writerDAO);
//       res.sendRedirect("/board.jsp");

    }
}

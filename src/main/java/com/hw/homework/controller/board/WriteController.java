package com.hw.homework.controller.board;

import com.hw.homework.DAO.WriterDAO;
import com.hw.homework.DTO.WriterDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/write.do")  // Annotation을 이용한 URL mapping
public class WriteController extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.getRequestDispatcher("/write.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        // 한글 인코딩
        req.setCharacterEncoding("UTF-8");
        // 사용자 입력 정보 추출 (name 파라미터)
        String writer = req.getParameter("writer");
        String content = req.getParameter("content");

       // DB 연동
       WriterDTO writerDTO = new WriterDTO();
       writerDTO.setWriter(writer);
       writerDTO.setContent(content);

       WriterDAO writerDAO = new WriterDAO();
       writerDAO.insertWriter(writerDTO);

        res.sendRedirect("/board.do");
    }
}

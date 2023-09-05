package com.hw.homework.controller.user;

import com.hw.homework.DAO.WriterDAO;
import com.hw.homework.DTO.WriterDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/updateBoard.do")
public class BoardUpdateController extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // 한글 인코딩
        req.setCharacterEncoding("UTF-8");
        // 사용자 입력 정보 추출
        String writerIndex = req.getParameter("writerIndex");
        String writer = req.getParameter("writer");
        String content = req.getParameter("content");
        System.out.println(writerIndex);
        System.out.println(writer);
        System.out.println(content);
        // DB 연동
        WriterDTO writerDTO = new WriterDTO();
        writerDTO.setWriterIndex(Integer.parseInt(writerIndex));
        writerDTO.setWriter(writer);
        writerDTO.setContent(content);

        WriterDAO writerDAO = new WriterDAO();
        writerDAO.updateWriter(writerDTO);

        res.sendRedirect("/board.do");
    }
}

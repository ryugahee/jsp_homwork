package com.hw.homework.controller.board;

import com.hw.homework.DAO.WriterDAO;
import com.hw.homework.DTO.WriterDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardDetail.do")
public class BoardDetailController extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        // 사용자 입력 정보 추출
        String writerIndex = req.getParameter("writerIndex");
        // DB 연동
        WriterDTO writerDTO = new WriterDTO();
        writerDTO.setWriterIndex(Integer.parseInt(writerIndex));

        WriterDAO writerDAO = new WriterDAO();
        WriterDTO writerDTO1 = writerDAO.selectWriter(writerDTO);


        req.setAttribute("writerDTO1",writerDTO1);
        req.getRequestDispatcher("/boardDetail.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {


    }
}

package com.hw.homework.controller.user;

import com.hw.homework.DAO.WriterDAO;
import com.hw.homework.DTO.WriterDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/board.do")
public class WriterController extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // DB 연동
        WriterDTO writerDTO = new WriterDTO();

        WriterDAO writerDAO = new WriterDAO();
        List<WriterDTO> writerDTOList = writerDAO.getWriterList(writerDTO);

        req.setAttribute("writerDTOList",writerDTOList);
        req.getRequestDispatcher("/board.jsp").forward(req, res);
    }
}

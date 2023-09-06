package com.hw.homework.controller.board;

import com.hw.homework.DAO.WriterDAO;
import com.hw.homework.DTO.WriterDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardDelete.do")
public class BoardDeleteController extends HttpServlet {
    protected void doGet (HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // 상태 정보 체크
        String userDTO1 = (String) req.getSession().getAttribute("id");
        if(userDTO1 == null) {
            res.sendRedirect("/");
        }
        // 사용자 입력 정보 추출
        String writerIndex = req.getParameter("writerIndex");
        // DB 연동
        WriterDTO writerDTO = new WriterDTO();
        writerDTO.setWriterIndex(Integer.parseInt(writerIndex));

        WriterDAO writerDAO = new WriterDAO();
        WriterDTO writerDTO1 = writerDAO.deleteWriter(writerDTO);

        req.setAttribute("writerDTO1", writerDTO1);
        // 이동한 화면의 객체를 가지고 있지 않을 때 -> sendRedirect 방식 사용
        res.sendRedirect("/board.do");
    }
}

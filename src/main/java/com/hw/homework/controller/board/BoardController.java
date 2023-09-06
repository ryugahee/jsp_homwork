package com.hw.homework.controller.board;

import com.hw.homework.DAO.WriterDAO;
import com.hw.homework.DTO.WriterDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/board.do")
public class BoardController extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // 상태 정보 체크
//        String userDTO1 = (String) req.getSession().getAttribute("id");  // 형변환 필요. getAttribute 메서드는 세션에서 속성을 가져올 때 Object 형태로 반환함
//        if(userDTO1 == null) {
//            res.sendRedirect("/");
//        }


        // DB 연동
        WriterDTO writerDTO = new WriterDTO();

        WriterDAO writerDAO = new WriterDAO();  // 객체 생성시 DAO에서 드라이버 로딩 시작
        List<WriterDTO> writerDTOList = writerDAO.getWriterList(writerDTO);

        req.setAttribute("writerDTOList",writerDTOList);
        req.getRequestDispatcher("/board.jsp").forward(req, res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.getRequestDispatcher("/board.jsp").forward(req, res);
    }
}

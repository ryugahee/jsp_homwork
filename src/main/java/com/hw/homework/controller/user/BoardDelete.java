package com.hw.homework.controller.user;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/boardDelete.do")
public class BoardDelete extends HttpServlet {
    protected void doPost (HttpServletRequest req, HttpServletResponse res) {
        // 사용자 입력 정보 추출
        String writerIndex = req.getParameter("writerIndex");
    }
}

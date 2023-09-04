package com.hw.homework.service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class Service extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 사용자 요청 path
        String uri = req.getRequestURI();
        String path = uri.substring(uri.lastIndexOf("/"));

        // path 분기처리
        if(path.equals("/board.do")) {
            System.out.println("게시판 이동");
        } else if(path.equals("write.do")) {
            System.out.println("글쓰기");
        }
    }
}

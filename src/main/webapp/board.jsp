<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hw.homework.DTO.WriterDTO" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <%--    반응형 웹에 사용되는 메타 태그--%>
    <mata name="viewport" content="width=device-width, initial-scale=1"></mata>
    <title>게시판</title>
</head>
<body>
<center>
    <h1  style="margin: 20px">명언 목록</h1>
    <hr>
    <h4 align="right"  ><a href="/logout.do" style="margin-right: 50px; text-decoration: none; color: black">로그아웃</a></h4>
    <form class="board-form" action="/board.do" method="get">
        <table style="text-align: center; border: 1px solid #dddddd; border-radius: 15px; margin: 20px; padding:20px; width: 350px;" >
            <thead>
            <tr>
                <div bgcolor="lightgrey" width="80px">
                <th>번호</th>
                <th>작가</th>
                <th>내용</th>
                </div>
            </tr>
            </thead>
            <tbody>
            <% for (WriterDTO writerDTO1 : (List<WriterDTO>) request.getAttribute("writerDTOList")) {%>
            <tr>
                <td >
                    <div>
                        <%=writerDTO1.getWriterIndex()%>
                    </div>
                </td>
                <td>
                    <div>
                        <%=writerDTO1.getWriter()%>
                    </div>
                </td>
                <td>
                    <div>
                        <a href="boardDetail.do?writerIndex=<%=writerDTO1.getWriterIndex()%>"><%=writerDTO1.getContent()%></a>
                    </div>
                </td>
            </tr>
            <% }%>
            </tbody>
        </table>
        <button><a href="write.do" style="text-decoration: none; color: black">글쓰기</a></button>
    </form>
</center>
</body>
</html>


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
<h1>명언 목록</h1>
<form class="board-form" action="/board.do" method="get">
    <table style="text-align: center; border: 1px solid #dddddd">
        <thead>
        <tr>
            <div border-bottom: 1px solid #dddddd">
                <th>번호</th>
                <th>작가</th>
                <th>내용</th>
            </div>
        </tr>
        </thead>
        <tbody>
        <% for (WriterDTO writerDTO1 : (List<WriterDTO>) request.getAttribute("writerDTOList")) {%>
        <tr>
            <td>
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
                    <%=writerDTO1.getContent()%>
                </div>
            </td>
        </tr>
        <% }%>
        </tbody>
    </table>
</form>
</body>
</html>

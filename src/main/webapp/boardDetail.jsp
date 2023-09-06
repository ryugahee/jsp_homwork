<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hw.homework.DTO.WriterDTO" %>

<% WriterDTO writerDTO1 = (WriterDTO)request.getAttribute("writerDTO1"); %>

<html>
<head>
    <mata name="viewport" content="width=device-width, initial-scale=1"></mata>
    <title>글 상세</title>
</head>
<body>
<center>
    <h1  style="margin: 20px">글 상세</h1>
    <hr>
    <form class="write-form" action="/updateBoard.do" method="post">
        <input type="hidden" name="writerIndex" value="<%=writerDTO1.getWriterIndex()%>">
        <table style="text-align: center; border:1px solid lightgray; border-radius: 15px; margin: 20px; padding:20px; width: 350px; height: 100px">
            <thead>
            <tr>
                <td>작성자</td>
                <td text-align="left"><input type="text" name="writer" value="<%=writerDTO1.getWriter()%>"></td>
            </tr>
            <tr>
                <td>내용</td>
                <td text-align="left"><input type="textarea" name="content" value="<%=writerDTO1.getContent()%>"></td>
            </tr>
            </thead>
            <tr>
                <td colspan="2" text-align="center">
                    <input type="submit" value="수정">
                </td>
            </tr>
        </table>
        <div align="center">
            <button><a href="board.do" style="text-decoration: none; color: black">글목록</a></button>
            <button><a href="boardDelete.do?writerIndex=<%=writerDTO1.getWriterIndex()%>" style="text-decoration: none; color: black">글삭제</a></button>
        </div>

    </form>
</center>

</body>
</html>


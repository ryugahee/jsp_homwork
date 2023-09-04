<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <mata name="viewport" content="width=device-width, initial-scale=1"></mata>
    <title>글 상세</title>
</head>
<body>
<h1 text>글 상세</h1>
<hr>
<form class="write-form" action="/boardDetail.do" method="post">
    <table style="text-align: center; border: 1px solid #dddddd">
        <thead>
        <tr>
            <td>작성자</td>
            <td text-align="left"><input type="text" name="writer" + value="<%=writerDTO1.getWriter%>"></td>
        </tr>
        <tr>
            <td>내용</td>
            <td text-align="left"><input type="textarea" name="content"></td>
        </tr>
        </thead>
        <tr>
            <td colspan="2" text-align="center">
                <input type="submit" value="수정">
            </td>
        </tr>
    </table>
    <a href="board.do">글목록</a>
</form>

</body>
</html>

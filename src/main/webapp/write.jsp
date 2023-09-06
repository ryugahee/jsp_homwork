<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <mata name="viewport" content="width=device-width, initial-scale=1"></mata>
    <title>글쓰기</title>
</head>
<body>
<center>
    <h1  style="margin: 20px">글쓰기</h1>
    <hr>
    <%--<form> 태그의 action 속성 => form data를 서버로 보낼 때 해당 데이터가 도착할 URL을 명시--%>
    <form class="write-form" action="/write.do" method="post">
        <table style="text-align: center; border:1px solid lightgray; border-radius: 15px; margin: 20px; padding:20px; width: 350px; height: 100px">
            <thead>
            <tr>
                <td>작성자</td>
                <td text-align="left"><input type="text" name="writer"></td>
            </tr>
            <tr>
                <td>내용</td>
                <td text-align="left"><input type="textarea" name="content"></td>
            </tr>
            </thead>
            <tr>
                <td colspan="2" text-align="center">
                    <input type="submit" value="등록">
                </td>
            </tr>
        </table>
        <button><a href="board.do" style="text-decoration: none; color: black">글 목록</a></button>
    </form>
</center>
</body>
</html>

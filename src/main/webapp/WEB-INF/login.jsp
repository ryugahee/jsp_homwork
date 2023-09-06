<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--    반응형 웹에 사용되는 메타 태그--%>
    <mata name="viewport" content="width=device-width, initial-scale=1"></mata>
    <title>로그인 페이지</title>
</head>
<body>
<div>
    <h1>로그인</h1>
    <hr>
    <form action="/board.do" method="post">
        <table style="text-align: center; border: 1px solid #dddddd">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td text-align="center">
                <td><input type="submit" value="로그인"></td>
            </tr>
        </table>
    </form>
    <br>
    <a href="/insertUser.do">회원 가입</a>
</div>
</body>
</html>

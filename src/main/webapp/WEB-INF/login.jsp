<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--    반응형 웹에 사용되는 메타 태그--%>
    <mata name="viewport" content="width=device-width, initial-scale=1"></mata>
    <title>로그인 페이지</title>
</head>
<body>
<center>
    <div></div>
    <h1 style="margin: 20px">로그인</h1>
    <hr>
    <form action="/login.do" method="post">
        <table style="text-align: center; border:1px solid lightgray; border-radius: 15px; margin: 20px; padding:20px; width: 350px; height: 150px">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <span class="error" style="font-size: x-small; color: red">${requestScope.error}</span>
                </td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="로그인"></td>
            </tr>
        </table>
    </form>
    <button><a href="/insertUser.do" style="text-decoration: none; color: black">회원 가입</a></button>
</center>
</body>
</html>

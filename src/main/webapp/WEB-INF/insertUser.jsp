<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<form action="/insertUser.do" method="post">
    <h1>회원가입</h1>
    <hr>
    아이디 : <input type="text" size="25" name="id"><br>
    비밀번호 : <input type="password" size="20" name="password"><br>
    이름 : <input type="text" size="30" name="name"><br>
    권한 : <input type="radio" name="role" value="USER" checked>USER
    <input type="radio" name="role" value="ADMIN">ADMIN<br>
    <hr>
    <input type="submit" value="가입하기">
</form>
</body>
</html>

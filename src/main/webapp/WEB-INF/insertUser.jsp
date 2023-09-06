<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>

<body>
<center>
    <form action="/insertUser.do" method="post">
        <h1  style="margin: 20px">회원가입</h1>
        <hr>
        <div style="border:1px solid lightgray; border-radius: 15px; margin: 20px; padding:15px; width: 350px; height: 200px">
            아이디 : <input type="text" size="20" name="id"><br>
            <br>
            비밀번호 : <input type="password" size="20" name="password"><br>
            <br>
            이름 : <input type="text" size="20" name="name"><br>
            <br>
            권한 : <input type="radio" name="role" value="USER" checked>USER
            <input type="radio" name="role" value="ADMIN">ADMIN<br>
            <br>
            <input type="submit" value="가입하기">
        </div>
    </form>
</center>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <mata name="viewport" content="width=device-width, initial-scale=1"></mata>
    <title>글쓰기</title>
</head>
<body>
<h1 text>글쓰기</h1>
<hr>
<form class="write-form" action="/write.do" method="post">
    <table style="text-align: center; border: 1px solid #dddddd">
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
</form>
</body>
</html>

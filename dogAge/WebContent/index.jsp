<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>犬年齢計算機</title>
</head>
<body>
<from action="/dogAge/Result" method="post">
犬の名前:<input type="text" name="name"><br>
犬の年齢:<input type="number" name="age"><br>
<input type="submit" value="送信">
</from>

</body>
</html>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <style>

            .reg {
                border: 1px solid gray;
                margin : 20px auto;
                padding: 15px;
                width: 40%;
            }
    </style>


</head>
<body>

    <from action="#" method="POST">
        # 키: <input type="text" name="stature"> <br>
        # 몸무게: <input type="text" name="weight"> <br>
        # 이름: <input type="text" name="name"> <br>

        <button type="submit">등록</button>
    </from>
</body>

</html>


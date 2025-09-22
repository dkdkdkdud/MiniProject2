<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
    body { font-family: Arial, sans-serif; padding: 20px; }
    form p { margin-bottom: 10px; }
    button { margin-right: 10px; }
</style>
</head>
<body>
    <h1>로그인 페이지</h1>

    <!-- Spring MVC 컨트롤러 URL로 POST 전송 -->
    <form action="${pageContext.request.contextPath}/member/login" method="post">
        <p>아이디: <input type="text" name="id" required></p>
        <p>비밀번호: <input type="password" name="password" required></p>
        <button type="submit">로그인</button>
        <button type="button" onclick="location.href='${pageContext.request.contextPath}/board/list'">취소</button>
    </form>

    <!-- 로그인 실패 메시지 -->
    <c:if test="${param.error == 'true'}">
        <p style="color:red;">로그인 실패! 아이디와 비밀번호를 확인하세요.</p>
    </c:if>

    <br>
    <a href="${pageContext.request.contextPath}/member/register">회원가입하러 가기</a>

</body>
</html>

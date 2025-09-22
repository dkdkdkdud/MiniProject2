<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<style>
    body { font-family: Arial, sans-serif; padding: 20px; }
    h1 { color: #333; }
</style>
</head>
<body>
    <h1>마이페이지</h1>

    <p>환영합니다, <c:out value="${sessionScope.user != null ? sessionScope.user.id : '게스트'}"/>님!</p>

    <ul>
        <li><a href="${pageContext.request.contextPath}/member/logout">로그아웃</a></li>
        <li><a href="${pageContext.request.contextPath}/board/list">게시판으로 이동</a></li>
    </ul>

    <p>여기서 회원 정보, 게시글 관리, 설정 등을 확인할 수 있습니다.</p>
</body>
</html>

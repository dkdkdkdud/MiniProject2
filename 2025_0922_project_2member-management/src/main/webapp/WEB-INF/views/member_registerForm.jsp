<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
<h1>회원가입 페이지</h1>

<form id="registerForm" action="${pageContext.request.contextPath}/member/registerAjax" method="post">
    <p>이름: <input type="text" name="name" required></p>
    <p>아이디: <input type="text" name="id" id="userId" required></p>
    <p>비밀번호: <input type="password" name="password" required></p>
    <p>이메일: <input type="email" name="email" required></p>
    <p>반려동물 종류:
        <input type="radio" name="petType" value="고양이" required> 고양이
        <input type="radio" name="petType" value="강아지" required> 강아지
        <input type="radio" name="petType" value="기타" required> 기타
    </p>
    <p>반려동물 이름: <input type="text" name="petName"></p>
    <p>생년월일: <input type="date" name="birthdate"></p>
    <button type="submit">회원가입</button>
    <button type="button" onclick="location.href='${pageContext.request.contextPath}/board/list'">취소</button>
</form>

<!-- AJAX 결과 표시 영역 -->
<div id="registerResult" style="color:red; margin-top:10px;"></div>

<script type="text/javascript">
    // 기존 아이디 유효성 검사
    const userIdInput = document.getElementById("userId");

    document.querySelector('form').addEventListener('submit', function(event) {
        event.preventDefault(); // 기본 폼 제출 막기

        const userId = userIdInput.value;
        const regex = /^[a-zA-Z]{3,}$/;

        if(!regex.test(userId)){
            alert('아이디는 3자 이상 영어로만 입력해야 합니다.');
            userIdInput.focus();
            return;
        }

        // AJAX 요청
        $.ajax({
            url: '${pageContext.request.contextPath}/member/registerAjax', // 새 Ajax용 URL
            type: 'POST',
            data: $(this).serialize(), // form 데이터 직렬화
            success: function(response) {
                if(response === 'success') {
                    $('#registerResult').css('color','green').text('회원가입 성공! 로그인 페이지로 이동합니다.');
                    setTimeout(function() {
                        window.location.href = '${pageContext.request.contextPath}/member/login';
                    }, 1500);
                } else {
                    $('#registerResult').css('color','red').text(response);
                }
            },
            error: function() {
                $('#registerResult').css('color','red').text('서버 오류가 발생했습니다.');
            }
        });
    });
</script>

<br>
<a href="${pageContext.request.contextPath}/member/login">이미 회원이신가요? 로그인하러 가기</a>

</body>
</html>

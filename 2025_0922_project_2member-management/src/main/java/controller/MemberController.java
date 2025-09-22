package controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    // 1. 회원가입 페이지 URL 패턴 처리 (GET)
    // URL: /member/register
    @GetMapping("/member/register") 
    public String showRegisterForm() {
        // 반환값: registerForm.jsp
    	return "member/member_registerForm";
    }

    // 2. 회원가입 처리 URL 패턴 처리 (POST)
    // URL: /member/register
    @PostMapping("/member/register") 
    public String processRegister(@RequestParam("id") String id, @RequestParam("password") String password) {
        // TODO: 여기서 회원가입 로직(데이터베이스 저장 등)을 처리

        // 서버 측 유효성 검사 (아이디 3자 이상 영어만)
        boolean isValidId = id.matches("^[a-zA-Z]{3,}$");

        if (!isValidId) {
            // 유효성 검사 실패 시 회원가입 페이지로 리디렉션하며, 오류 메시지 전달
            return "redirect:/member/register?error=invalidId";
        }
        
        // 데이터베이스 저장 로직이 성공했다고 가정
        
        // 반환값: 로그인 페이지로 리디렉션
        return "redirect:/member/login";
    }

    // 3. 로그인 페이지 URL 패턴 처리 (GET)
    // URL: /member/login
    @GetMapping("/member/login") 
    public String showLoginForm() {
        // 반환값: loginForm.jsp
        return "member/member_loginForm";
    }

    // 4. 로그인 처리 URL 패턴 처리 (POST)
    // URL: /member/login
    @PostMapping("/member/login")
    public String processLogin(@RequestParam("id") String id, @RequestParam("password") String password) {
        // TODO: 로그인 로직(아이디, 비밀번호 확인)을 처리
        
        // 로그인 성공 여부에 따라 다른 페이지로 리디렉션
        boolean isLoginSuccess = true; // 실제로는 DB 조회 결과에 따라 결정

        if (isLoginSuccess) {
            // 반환값: 마이페이지로 리디렉션
            return "redirect:/member/mypage";
        } else {
            // 반환값: 로그인 실패 시 로그인 페이지로 리디렉션하며, 오류 메시지 전달
            return "redirect:/member/login?error=true";
        }
    }

    // 5. 마이페이지 URL 패턴 처리 (GET)
    // URL: /member/mypage
    @GetMapping("/member/mypage") 
    public String showMypage() {
        // 반환값: mypage.jsp
        return "member/member_mypage";
    }
    
    @PostMapping("/member/registerAjax")
    @ResponseBody // Ajax 요청은 view가 아닌 문자열 응답
    public String processRegisterAjax(@RequestParam("id") String id,
                                      @RequestParam("password") String password,
                                      @RequestParam("name") String name,
                                      HttpSession session) {
        // 아이디 유효성 검사
        if(!id.matches("^[a-zA-Z]{3,}$")) {
            return "아이디는 3자 이상 영어로만 입력해야 합니다.";
        }

//        // TODO: 실제 DB 저장
//        session.setAttribute("user", new User(id, name, password)); // 테스트용

        return "success";
    }

}
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	public MainController() {
		// TODO Auto-generated constructor stub
		System.out.println("--MainController()--");
	}
	
	@RequestMapping("/main/index.do")	
	public String home(){		
		
		return "main/index";
		
	}
	@RequestMapping("/main/write.do")	
	public String write(){
		
		
		return "main/write";
		
	}
	@RequestMapping("/main/mypage.do")	
	public String mypage(){
		
		
		return "main/mypage";
		
	}
	@RequestMapping("/main/callender.do")	
	public String callender(){
		
		
		return "main/callender";
		
	}
	

}

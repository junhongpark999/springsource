package com.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.study.dto.UserDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {

	//@RequestMapping(path= "/login", method = RequestMethod.GET) 
	//http://localhost:9090/sample/login
	@GetMapping("/login")
	public String login() {
		log.info("login...."); //  WEB-INF/views/sample/login.jsp
		
		return "sample/login";
	}
	
//	@RequestMapping(path= "/login", method = RequestMethod.POST) //http://localhost:9090/sample/login
//	@PostMapping("/login")
//	public void loginPost(String userid,String password,String addr,int age) {
//		log.info("login POST...."+userid+" "+password+" "+addr); //  WEB-INF/views/sample.\/login.jsp
//	}
	
	
	@PostMapping("/login")
	public String loginPost(@ModelAttribute("user") UserDTO userDto) {
		log.info("login POST...."+userDto.getUserid()+" "+userDto.getPassword()+" "+userDto.getAddr()+" "+userDto.getAge()); //  WEB-INF/views/sample.\/login.jsp
		
		return "sample/logout";
		
//		return "home";  - forward
//				redirect: -sendRedirect
//		return "redirect:/calc/add"; //가야할 경로(get 방식) (가야할 페이지가 아님)
//		return "redirect:/"; 
	}
	
	
//	@PostMapping("/login")
//	public void loginPost(HttpServletRequest request) {
//		String userid = request.getParameter("userid");
//		String password = request.getParameter("password");
//		String addr = request.getParameter("addr");
//		String age = request.getParameter("age");
//		log.info("login POST...."+userid+" "+password+" "+addr+" "+age);
//	}
}

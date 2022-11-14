package com.bitacademy.helloweb.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {				//handler
		return"/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public String hello(String name, Long no) {				
		System.out.println("name:"+name+", no:"+no);
		return"/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello3")
	public ModelAndView hello3(String name) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("name",name);
		mav.setViewName("/WEB-INF/views/hello3.jsp");
		
		return mav;
	}
	
	// 추천☆☆☆
	@RequestMapping("/hello4")
	public String hello4(String name, Model model) {
		model.addAttribute("name",name);
		return "/WEB-INF/views/hello4.jsp";
		
	}
	
	@ResponseBody
	@RequestMapping("/hello5")
	public String hello5(String name) {
		return "<h1>Hello World</h1>";
	}
	
	//redirect
	@RequestMapping("/hello6")
	public String hello6(String name) {
		
		return "redirect:/hello";
	}
	
	//이식성 down, 사용x
	@RequestMapping("/hello7")
	public void hello7(
			HttpServletRequest request,
			HttpServletResponse response,
			Writer out) throws IOException{
		
		String name = request.getParameter("name");
//		response.getWriter().println("hello" + name);
		out.write("hello"+name);
	}
	
}

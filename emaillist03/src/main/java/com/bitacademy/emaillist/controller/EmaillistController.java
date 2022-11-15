package com.bitacademy.emaillist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitacademy.emaillist.repository.EmaillistRepository;

@Controller
public class EmaillistController{
	@Autowired
	private EmaillistRepository emaillistRepository;
		
	@ResponseBody
	@RequestMapping("")
	public String index() {
		return "index!!";
	}
	
}
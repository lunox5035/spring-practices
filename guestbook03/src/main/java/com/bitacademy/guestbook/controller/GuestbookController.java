package com.bitacademy.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitacademy.guestbook.repository.guestbookRepository;
import com.bitacademy.guestbook.vo.guestbookVo;

@Controller
public class GuestbookController {
	@Autowired
	private guestbookRepository
	@RequestMapping("")
	public String index(Model model) {
		List<guestbookVo> list = guestbookRepository.findAll();
	}
	
}

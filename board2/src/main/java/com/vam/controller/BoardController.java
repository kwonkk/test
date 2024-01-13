package com.vam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vam.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService bservice;
	
//	게시판 목록 페이지 접속
	@GetMapping("/list")
//	=> @RequestMapping(value="list", method=RequestMethod.Get)
	public void boardListGet(Model model) {
		log.info("게시판 목록 페이지 진입");
		
		model.addAttribute("list", bservice.getList());
	}
	
	//게시판 조회
	@GetMapping("/get")
	public void boardGetPageGET(int bno, Model model) {
		model.addAttribute("pageInfo",bservice.getPage(bno));
	}
}

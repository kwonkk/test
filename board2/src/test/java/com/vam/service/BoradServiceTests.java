package com.vam.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoradServiceTests {

	@Autowired
	private BoardService service;
	
	//게시판 등록 테스트
//	@Test
//	public void testEnroll() {
//		
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("service test");
//		vo.setContent("service test");
//		vo.setWriter("service test");
//		
//		service.enroll(vo);
//	}
	

//	게시판 목록 테스트
//	@Test
//	public void testGetList() {
//		service.getList().forEach(board->log.info(""+board));
//	}
	
//	게시판조회
	@Test
	public void testGETPage() {
		int bno = 8;
		
		log.info(""+service.getPage(bno));
	}
}

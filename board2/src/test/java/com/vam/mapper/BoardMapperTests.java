package com.vam.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BoardVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	
	@Test
	public void testEnroll() {
		BoardVO vo = new BoardVO();
		
		vo.setTitle("mapper test");
		vo.setContent("mapper test");
		vo.setWriter("mapper test");
		
		mapper.enroll(vo);
	}

	
	/*@Test
	public void testGetList() {
		
		List list = mapper.getList();
		
		for(int i = 0; i<list.size();i++) {
			log.info(""+list.get(i));
		}
	}*/
	
//	게시판 조회
//	@Test
//	public void testGetPage() {
////		실제 존재하는 페이지
//		int bno = 8;
//		
//		log.info(""+mapper.getPage(bno));
//	}
}

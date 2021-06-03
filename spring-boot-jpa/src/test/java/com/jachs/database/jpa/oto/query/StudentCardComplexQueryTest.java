package com.jachs.database.jpa.oto.query;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.database.jpa.dao.oto.StudentCardRepository;
import com.jachs.database.jpa.entity.oto.StudentCard;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class StudentCardComplexQueryTest {
	@Autowired
	private StudentCardRepository studentCardRepository;

	// 单字段查询
	@Test
	public void test() {
		StudentCard sc = studentCardRepository.findBycardName("机随称随");
		System.out.println(sc.getCardId());
	}

	// 多条件And
	@Test
	public void test1() {
		StudentCard sc = studentCardRepository.findByCardNameAndCardType("机随称随", "学生卡1");
		System.out.println(sc.getCardId());
	}

	@Test
	public void test2() {
		List<StudentCard> scList = studentCardRepository.findByCardType("学生卡1");
		
		for (StudentCard studentCard : scList) {
			System.out.println(studentCard.getCardId());
		}
	}
}

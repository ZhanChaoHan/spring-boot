package com.jachs.database.jpa.oto.add;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.database.jpa.dao.oto.StudentRepository;
import com.jachs.database.jpa.entity.oto.Student;
import com.jachs.database.jpa.entity.oto.StudentCard;

/**
 * @author zhanchaohan
 * 
 */
@SpringBootTest
public class StudentTest {
	@Autowired
	private StudentRepository studentRepository;

	// 单存
	@Test
	public void saveAStudent() {
		Student s = new Student();
		s.setStudentId("sOne");
		s.setStudentName("马保国");
		s.setStudentAge(69);
		s.setDateOfBirth(new Date());
		studentRepository.save(s);
	}

	// 关联存储
	@Test
	public void saveAStudentAndCard() {
		Student s = new Student();
		s.setStudentId("sOne");
		s.setStudentName("马保国");
		s.setStudentAge(69);
		s.setDateOfBirth(new Date());

		StudentCard sc = new StudentCard();
		sc.setCardId("sOneC");
		sc.setCardMonery(5L);
		sc.setCardType("老年卡");

		s.setStudentCard(sc);
		studentRepository.save(s);
	}

	@Test
	public void saveMany() {
		List<Student>allS=new ArrayList<Student>();
		RandomStringUtils rsu=new RandomStringUtils();
		Random rd=new Random();
		DateUtils du=new DateUtils();
		Date da=new Date();
		for (int kk = 0; kk < 100; kk++) {
			Student s = new Student();
			
			s.setStudentId(rsu.randomAlphabetic(255));
			s.setStudentName(rsu.randomAlphabetic(255));
			s.setStudentAge(rd.nextInt());
			s.setDateOfBirth(du.addDays(da, rd.nextInt(50)));
			
			allS.add(s);
		}
		studentRepository.saveAll(allS);
	}

	// 删除主表从表数据一起删了
	@Test
	public void deleteStuend() {
		studentRepository.delete(studentRepository.findById("sOne").get());
	}
}

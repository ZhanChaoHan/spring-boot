package com.jachs.database.jpa.specificati;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.database.jpa.SpringBootJpaApplication;
import com.jachs.database.jpa.dao.otn.ComputerRepository;
import com.jachs.database.jpa.dao.otn.SoftWareRepository;
import com.jachs.database.jpa.entity.otn.Computer;
import com.jachs.database.jpa.specificati.query_entity.ComputerDto;
import com.jachs.database.jpa.utill.QueryHelp;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = SpringBootJpaApplication.class)
public class QueryHelpDemo {
	@Autowired
	private ComputerRepository computerRepository;
	@Autowired
	private SoftWareRepository softWareRepository;

	@Test
	public void test() {
		ComputerDto cd = new ComputerDto();

		cd.setComputerName("软");
		List<Computer> systemUserList = computerRepository
				.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root, cd, criteriaBuilder));

		for (Computer computer : systemUserList) {
			System.out.println(computer.getComputerId() + "\t" + computer.getComputerName());
		}
	}

	@Test
	public void test1() {
		ComputerDto cd = new ComputerDto();

		cd.setComputerName("软");
		List<Computer> systemUserList = computerRepository
				.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root, cd, criteriaBuilder));

		for (Computer computer : systemUserList) {
			System.out.println(computer.getComputerId() + "\t" + computer.getComputerName());
		}
	}
}

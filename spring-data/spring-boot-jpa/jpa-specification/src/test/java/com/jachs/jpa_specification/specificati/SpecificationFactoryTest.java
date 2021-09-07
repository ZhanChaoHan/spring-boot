package com.jachs.jpa_specification.specificati;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;

import com.jachs.jpa_specification.dao.PersonRepository;
import com.jachs.jpa_specification.entity.oto.Person;
import com.jachs.jpa_specification.utill.SpecificationFactory;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class SpecificationFactoryTest {
	@Autowired
	private PersonRepository personRepository;


	/***
	 * select student0_.studentId as studenti1_12_, student0_.dateOfBirth as dateofbi2_12_,
	 *  student0_.studentAge as studenta3_12_, student0_.sCart as scart5_12_, 
	 *  student0_.studentName as studentn4_12_ from Student student0_ 
	 *  where student0_.studentAge<=15 and (student0_.studentName like ?) and
	 *   cast(student0_.dateOfBirth as binary)<1624858146479
	 */
	@Test
	public void test3() {
		 // 构造条件
	    Specification specification = SpecificationFactory.lt("dateOfBirth", 1);
	    specification = specification.and(SpecificationFactory.like("studentName", ""));
	    specification = specification.and(SpecificationFactory.lte("studentAge",""));
	    // 打印结果
	    List<Person> systemUserList = personRepository.findAll(specification);
	    
	    for (Person user : systemUserList) {
	        System.out.println(user);
	    }
	}
}

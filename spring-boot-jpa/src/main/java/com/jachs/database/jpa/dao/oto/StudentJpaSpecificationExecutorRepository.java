package com.jachs.database.jpa.dao.oto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.jachs.database.jpa.entity.oto.Student;


/**
 * @author zhanchaohan
 * 
 */
@Repository
public interface StudentJpaSpecificationExecutorRepository extends JpaRepository<Student, String>,JpaSpecificationExecutor<Student>{

}

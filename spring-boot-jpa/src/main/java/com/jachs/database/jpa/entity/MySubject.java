package com.jachs.database.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * 课程表
 * @author zhanchaohan
 * 
 */
@Data
@Entity
@Table(name="MySubject")
public class MySubject {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int subjectId;
	
	
	@Column(name = "subjectName", nullable = true, length = 5)
    private String subjectName;
	
	@ManyToMany
	@JoinTable()
	private List<MyStudent>myStudentList;

	
}

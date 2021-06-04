package com.jachs.database.jpa.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * 得分表
 * @author zhanchaohan
 * 
 */
@Data
@Entity
@Table(name="Example")
public class Example {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
	
	@OneToOne(optional = false)
	@JoinColumn(name="myStudentId",referencedColumnName="StudentId")
    private MyStudent myStudent;
	
	@OneToOne(optional = false)
	@JoinColumn(name="mySubjectId",referencedColumnName="SubjectId")
    private MySubject mySubject;
    
    
    @Column(name = "score", nullable = true, length = 3)
    private int score;
}

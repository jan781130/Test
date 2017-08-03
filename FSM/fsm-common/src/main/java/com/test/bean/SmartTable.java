package com.test.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

//@NamedQueries(
//		@NamedQuery(
//		name = "GET_SMARTTABLE_DATA",
//		query = "SELECT T FROM SmartTable T"
//				+ "CASE WEHN　：tableState.sort.predicate　IS NOT NULL"
//				+ "THEN　ORDER bY :tableState.sort.predicate "
//					+ "CASE WHEN ：tableState.sort.reverse IS TRUE"
//					+ "TEHN DESC ELSE ASC END"
//				+ "ELSE END"
//	)
//)


@Entity
@Table(name="SMARTTABLE")
public class SmartTable {
	
	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "AGE", nullable = false)
	private Integer age;
	
	@Column(name = "BIRTHDAY", nullable = false)
	private Date birthday;
	
	@Column(name = "SAVED", nullable = false)	
	private Integer saved;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getSaved() {
		return saved;
	}
	public void setSaved(Integer saved) {
		this.saved = saved;
	}
	
	
	
}

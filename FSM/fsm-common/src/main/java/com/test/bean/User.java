package com.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;



@NamedQueries(
	    @NamedQuery(
	        name = "get_user_by_id",
	        query = "select user from User user where userId = :id"
	    )
	)

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@Column(name = "USER_ID", nullable = false)
    private Integer userId;
 
    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
    
    
    
}

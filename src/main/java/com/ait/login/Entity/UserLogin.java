
package com.ait.login.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="USER_LOGIN_TABLE")
@Data

public class UserLogin {

	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private String username;
	
	private String password;
	@Enumerated(EnumType.STRING)
	private AccountStatus accountstatus;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AccountStatus getAccountstatus() {
		return accountstatus;
	}
	public void setAccountstatus(AccountStatus accountstatus) {
		this.accountstatus = accountstatus;
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "UserLogin [Id=" + Id + ", username=" + username + ", password=" + password + ", accountstatus="
				+ accountstatus + "]";
	}
	
	
	
}

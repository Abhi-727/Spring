package com.org.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdentityGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Embeddable
public class Account {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer accId;
	private String aacType;
	private Long accNumb;
	
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", aactype=" + aacType + ", accNumb=" + accNumb + "]";
	}	
	
}

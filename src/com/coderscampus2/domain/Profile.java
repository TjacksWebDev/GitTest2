package com.coderscampus2.domain;

import java.time.LocalDate;

public class Profile {
	private Integer id;
	private String profileName;
	private String url;
	private LocalDate createdDate;
	
	 public  Integer getId() {
		 return id;
	}
	 public void setId(Integer id) {
		 	this.id = id;
	 }
	 public  String getProfileName() {
		 return profileName;
	}
	 public void setName(String profileName) {
		 	this.profileName = profileName;
	 }
	 public String getUrl() {
		 return url;
	}
	 public void setUrl(String url) {
		 	this.url = url;
	 }
	 public LocalDate getCreatedDate() {
		 return createdDate;
	 }
	 public void setCreateDate(LocalDate createdDate) {
	 		this.createdDate = createdDate;
	 }
}


package com.globant.qe.in.travelocity.models;

import org.springframework.stereotype.Component;

@Component
public class GetInspiredTabVerificationtestData {

	private String website;

	private String name;

	private String comment;

	private String email;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

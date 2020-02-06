package com.globant.qe.in.travelocity.models;

import org.springframework.stereotype.Component;

@Component
public class CruiseData {
	private String cruiseGoingTo;

	private String departAsEarlyAs;

	private String departAsLateAs;

	public String getCruiseGoingTo() {
		return cruiseGoingTo;
	}

	public void setCruiseGoingTo(String cruiseGoingTo) {
		this.cruiseGoingTo = cruiseGoingTo;
	}

	public String getDepartAsEarlyAs() {
		return departAsEarlyAs;
	}

	public void setDepartAsEarlyAs(String departAsEarlyAs) {
		this.departAsEarlyAs = departAsEarlyAs;
	}

	public String getDepartAsLateAs() {
		return departAsLateAs;
	}

	public void setDepartAsLateAs(String departAsLateAs) {
		this.departAsLateAs = departAsLateAs;
	}
}
package com.globant.qe.in.travelocity.models;

import org.springframework.stereotype.Component;

@Component
public class TravelocityActivityData {

	private String activityto;

	private String activityfrom;

	private String activityDestination;

	public String getActivityto() {
		return activityto;
	}

	public void setActivityto(String activityto) {
		this.activityto = activityto;
	}

	public String getActivityfrom() {
		return activityfrom;
	}

	public void setActivityfrom(String activityfrom) {
		this.activityfrom = activityfrom;
	}

	public String getActivityDestination() {
		return activityDestination;
	}

	public void setActivityDestination(String activityDestination) {
		this.activityDestination = activityDestination;
	}
}

package com.globant.qe.in.travelocity.models;

import org.springframework.stereotype.Component;

@Component
public class CarData {
	private String dropOff;

	private String pickupDate;

	private String pickingUp;

	private String dropOffDate;

	public String getDropOff() {
		return dropOff;
	}

	public void setDropOff(String dropOff) {
		this.dropOff = dropOff;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getPickingUp() {
		return pickingUp;
	}

	public void setPickingUp(String pickingUp) {
		this.pickingUp = pickingUp;
	}

	public String getDropOffDate() {
		return dropOffDate;
	}

	public void setDropOffDate(String dropOffDate) {
		this.dropOffDate = dropOffDate;
	}
}
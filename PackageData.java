package com.globant.qe.in.travelocity.models;

import org.springframework.stereotype.Component;

@Component
public class PackageData {
	private String goingToCity;

	private String hotelCheckinDate;

	private String rating;

	private String hotelCheckoutDate;

	public String getGoingToCity() {
		return goingToCity;
	}

	public void setGoingToCity(String goingToCity) {
		this.goingToCity = goingToCity;
	}

	public String getHotelCheckinDate() {
		return hotelCheckinDate;
	}

	public void setHotelCheckinDate(String hotelCheckinDate) {
		this.hotelCheckinDate = hotelCheckinDate;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getHotelCheckoutDate() {
		return hotelCheckoutDate;
	}

	public void setHotelCheckoutDate (String hotelCheckoutDate)
    {
        this.hotelCheckoutDate = hotelCheckoutDate;
    }
}
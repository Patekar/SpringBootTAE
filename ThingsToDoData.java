package com.globant.qe.in.travelocity.models;

import org.springframework.stereotype.Component;

@Component
public class ThingsToDoData {

	private String tickets;

	private String toursActivities;

	private String destination;

	private String from;

	private String to;

	private String interests;

	private String recommendations;

	public String getTickets() {
		return tickets;
	}

	public void setTickets(String tickets) {
		this.tickets = tickets;
	}

	public String getToursActivities() {
		return toursActivities;
	}

	public void setToursActivities(String toursActivities) {
		this.toursActivities = toursActivities;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	}
}
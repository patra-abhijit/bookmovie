package com.moviebookingapp.Model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="Seat")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Integer> getSeats() {
		return seats;
	}
	public void setSeats(List<Integer> seats) {
		this.seats = seats;
	}
	private String id;
	private List<Integer> seats;
	public Seat() {
		super();
	}
	public Seat(String id, List<Integer> seats) {
		super();
		this.id = id;
		this.seats = seats;
	}

}

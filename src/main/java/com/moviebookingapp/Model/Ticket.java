package com.moviebookingapp.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="tickets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	
	@Id
	private String id;
	private String movieName;
	private String theatreName;
	private String movieId;
	private int noOfSeat;
	private String user;
	private List<Integer> seatNo;
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", movieName=" + movieName + ", theatreName=" + theatreName + ", movieId=" + movieId
				+ ", noOfSeat=" + noOfSeat + ", user=" + user + ", seatNo=" + seatNo + "]";
	}
	public Ticket() {
		super();
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public List<Integer> getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(List<Integer> seatNo) {
		this.seatNo = seatNo;
	}
	public Ticket(String id, String movieName, String theatreName, String movieId, int noOfSeat, String user,
			List<Integer> seatNo) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.movieId = movieId;
		this.noOfSeat = noOfSeat;
		this.user = user;
		this.seatNo = seatNo;
	}

}

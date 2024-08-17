package com.moviebookingapp.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="movie")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	
	@Id
	private String id;
	private String movieName;
	private String theatreName;
	private int noOfTicket;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Movie(String id, String movieName, String theatreName, int noOfTicket, String status) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.noOfTicket = noOfTicket;
		this.status = status;
	}
	public Movie() {
		super();
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
	public int getNoOfTicket() {
		return noOfTicket;
	}
	public void setNoOfTicket(int noOfTicket) {
		this.noOfTicket = noOfTicket;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", theatreName=" + theatreName + ", noOfTicket="
				+ noOfTicket + ", status=" + status + "]";
	}
	

}

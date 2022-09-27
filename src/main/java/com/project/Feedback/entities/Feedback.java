package com.project.Feedback.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
import lombok.Data;
*/
public class Feedback 
{
		
	private Integer id;
	private String comments;
	private int rating;
	private String user;

	public Feedback() 
	{
		super();
	}

	public Feedback(String comments, Integer rating, String user) {
		this.comments = comments;
		this.rating = rating;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", comments=" + comments + ", rating=" + rating + ", user=" + user + "]";
	}

}

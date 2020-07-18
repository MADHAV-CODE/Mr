package com.dxc.movie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "MoviesInfo")
public class MovieApplication {
	
	@Column(name = "movie_id", length=10)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column (name="Movie_Name", nullable=true, length=50)
	private String name;
	
	@Column (name="Movie_Rating" , nullable=true, length=50 )
	private String Rating;
	
	@Column (name="Movie_Category", nullable=true, length=50)
	private String category;
	
	@Column (name="Movie_Type", nullable=true, length=50)
	private String type;
	
	@Column (name="Movie_Duration", nullable=true, length=50)
	private String duration;

	
	public MovieApplication(Integer id, String name, String rating, String category, String type, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.Rating = rating;
		this.category = category;
		this.type = type;
		this.duration = duration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return Rating;
	}

	public void setRating(String rating) {
		Rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}


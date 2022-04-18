package com.coderscampus.tristanassignment10.dto;

/*
 * {
"meals":[  // meals is a list of 3 objects
			{
			"id":245722,
			"imageType":"jpg",
			"title":"Carrot Cake",
			"readyInMinutes":75,
			"servings":12,
			"sourceUrl":"https://www.simplyrecipes.com/recipes/carrot_cake/"
			},
			{},
			{}
		],
			"nutrients":{
			"calories":1833.69,
			"protein":55.59,
			"fat":64.74,
			"carbohydrates":260.25
			}
    }
 * 
 */
	


public class Meals {
	
	private Integer id;
	private String imageType;
	private String title;
	private Integer readyInMinutes;
	private Integer servings;
	private String sourceUrl;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	
	@Override
	public String toString() {
		return "Meals [id=" + id + ", imageType=" + imageType + ", title=" + title + ", readyInMinutes="
				+ readyInMinutes + ", servings=" + servings + ", sourceUrl=" + sourceUrl + "]";
	}

}

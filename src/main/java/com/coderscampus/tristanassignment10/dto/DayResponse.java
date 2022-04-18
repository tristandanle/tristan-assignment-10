package com.coderscampus.tristanassignment10.dto;

import java.util.ArrayList;
import java.util.List;

/*
 * {
"meals":[
			{
			"id":245722,
			"imageType":"jpg",
			"title":"Carrot Cake",
			"readyInMinutes":75,
			"servings":12,
			"sourceUrl":"https://www.simplyrecipes.com/recipes/carrot_cake/"
			},
			{
			},
			{
			}
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



public class DayResponse {
	private List<Meals> meals; // list of 3 Object meals
	private Nutrients nutrients;
	
	
	public List<Meals> getMeals() {
		return meals;
	}
	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	@Override
	public String toString() {
		return "DayResponse [meals=" + meals + ", nutrients=" + nutrients + "]";
	}
	

	
	
}

package com.coderscampus.tristanassignment10.dto;

import java.util.ArrayList;
import java.util.List;

// Json  Parser Online - Data Structure of the week
// https://api.spoonacular.com/mealplanner/generate?timeFrame=week&diet=vegetarian&exclude=shellfish,&apiKey=7413e61b790a4da684fef998228172a2
// http://json.parser.online.fr/
/*
 * {
"week":{
	"monday":{
			"meals":[
					  {
						"id":571922,
						"imageType":"jpg",
						"title":"Momma Spider Pull Apart Cupcakes",
						"readyInMinutes":50,
						"servings":18,
						"sourceUrl":"http://www.ladybehindthecurtain.com/momma-spider-pull-apart-cupcakes/"
					   },
					   {},
					   {}
					 ],
			 "nutrients":{
						  "calories":1804.98,
						  "protein":51.65,
						  "fat":65.13,
						  "carbohydrates":254.47
						  }
					     },
	"tuesday":{
	"meals":[],
	"nutrients":{}
	},
	"wednesday":{},
	"thursday":{},
	"friday":{},
	"saturday":{},
	"sunday":{}
	  }
    }
 */


public class WeekResponse {
	
// List<DayResponse> weeks = new ArrayList<>();  // Week is not an array of days
	private Week week; // week contains 7 days - monday-sunday

	public Week getWeek() {
		return week;
	}

	public void setWeek(Week week) {
		this.week = week;
	}

	
	
  
	
}

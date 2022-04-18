package com.coderscampus.tristanassignment10.web;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.tristanassignment10.dto.DayResponse;
import com.coderscampus.tristanassignment10.dto.WeekResponse;

@RestController

public class SpoonacularController {
	
	// url base && mealplan are stored in the application.properties
	@Value("${spoonacular.urls.base}")
	private String spoonacularUrlsBase;
	
	@Value("${spoonacular.urls.mealplan}")
	private String spoonacularUrlsMealplan;
	
	@SuppressWarnings("unchecked")
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		String week = "week";
		ResponseEntity<WeekResponse> swr = (ResponseEntity<WeekResponse>) responseCallSpoonacularAPI(week, numCalories,
				diet, exclusions, WeekResponse.class);
		return swr;
	}
	
	
	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		String day = "day";
		@SuppressWarnings("unchecked")
		ResponseEntity<DayResponse> sdr = (ResponseEntity<DayResponse>) responseCallSpoonacularAPI(day, numCalories,
				diet, exclusions, DayResponse.class);
		return sdr;
	}

	
	// @GetMapping("/day-meal") // use for test http entity response
	@SuppressWarnings("rawtypes")
	public ResponseEntity<?> responseCallSpoonacularAPI(String date, String numCalories, String diet,
			String exclusions, Class sar) { // sar: Spoonacular API response
		String apikey = "7413e61b790a4da684fef998228172a2";
		//String url = "https://api.spoonacular.com/mealplanner/generate";
		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(spoonacularUrlsBase + spoonacularUrlsMealplan )
				.queryParam("timeFrame", date)
//			        .queryParam("targetCalories",Integer.parseInt(numCalories)) // failed:[na:na]
//			        .queryParam("diet", diet)
//				.queryParam("exclude", exclusions)
				.queryParam("apiKey", apikey);
//		        .build()
//		        .toUri();

		if (!ObjectUtils.isEmpty(numCalories)) {
			builder = builder.queryParam("targetCalories", Integer.parseInt(numCalories));
		}

		if (!ObjectUtils.isEmpty(diet)) {
			builder = builder.queryParam("diet", diet);
		}

		if (!ObjectUtils.isEmpty(exclusions)) {
			builder = builder.queryParam("exclude", exclusions);
		}

		URI uri = builder.build().toUri();

		// String response = rt.getForObject(uri, String.class);
		// Return the entire HTTP response - status, body
		@SuppressWarnings("unchecked")
		// ResponseEntity<String> response = rt.getForEntity(uri, String.class);
		ResponseEntity<?> shr = restTemplate.getForEntity(uri, sar);
		System.out.println(uri.toString()); 
		// System.out.println(shr);
		//System.out.println(spoonacularUrlsBase + spoonacularUrlsMealplan);
		return shr; //shr: spoonacularHttpResponse
	}
}

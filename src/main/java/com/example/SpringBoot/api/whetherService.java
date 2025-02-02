package com.example.SpringBoot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class whetherService {

	public static final String apiKey="b8413e953393f00d5cfa4a4158e69c38";
	public static final String API="https://api.weatherstack.com/current?access_key=API_Key&query=City";
	
	@Autowired
	RestTemplate rest;
	
	public whetherResponse getWhether(String city) {
		String api=API.replace("API_Key",apiKey).replace("City",city);
//		System.out.print(api);
//		return api;
		ResponseEntity<whetherResponse> response=rest.exchange(api, HttpMethod.GET,null,whetherResponse.class);
		return response.getBody();
		}
}

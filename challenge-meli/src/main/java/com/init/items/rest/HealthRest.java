package com.init.items.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.items.entities.Health;
import com.init.items.entities.InfoRequest;

@RestController
@RequestMapping("/health")
public class HealthRest {
	
	@GetMapping()
	public ResponseEntity<List<Health>> item() {
		
		//New health data
		List<InfoRequest> requests1 = new ArrayList<>(Arrays.asList(new InfoRequest(200,2),new InfoRequest(100,1)));
		Health health1 = new Health("2018-04-20T13:15:50.000Z",20,3,15,3,requests1);
		
		//List of health 
		List<Health> healths = new ArrayList<>(Arrays.asList(health1));
		
		//Response
		return ResponseEntity.ok(healths);
	}

}

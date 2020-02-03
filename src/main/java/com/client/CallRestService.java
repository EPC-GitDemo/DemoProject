package com.client;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pracrice.demo.model.Alian;

@Component
public class CallRestService implements CommandLineRunner {

	private static void callRestService ()
	{
	
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Alian>> response = restTemplate.exchange("http://localhost:8080/aliens", 
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Alian>>(){});
		List<Alian> aliens = response.getBody();
		System.out.println(aliens);			
			
		
	/*RestTemplate rt=new RestTemplate();//--to get a perticular recoed
	Alian ov= rt.getForObject("http://localhost:8080/alien/104",Alian.class);
	System.out.println(ov.getAname());//iterator*/
	
	}

	@Override
	public void run(String... args) throws Exception {
		callRestService();
		
	}
}

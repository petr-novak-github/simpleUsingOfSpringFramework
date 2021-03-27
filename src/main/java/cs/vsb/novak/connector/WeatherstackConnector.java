package cs.vsb.novak.connector;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class WeatherstackConnector {
	
	//http://api.weatherstack.com/current?access_key=5a4d4d6fc958354b6d41e922284fec4d&query=New%20York
	private static String baseURL="http://api.weatherstack.com/";
	private static String urlParams="current?access_key=";
	private static String APIkey = "5a4d4d6fc958354b6d41e922284fec4d";
	private static String url=baseURL+urlParams+APIkey+"&query=";
	
	public String getWeatherForCity(String city) {
		
		RestTemplate template = new RestTemplate();
		URI uri = null;
		try {
			 uri = new URI(url+city);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ResponseEntity<String> response = template.getForEntity(uri, String.class);
		return response.getBody();
	}
	
}

//private static String baseURL="http://api.weatherstack.com/";
//private static String urlParams="current?access_key=";
//private static String APIkey = 
//private static String url=baseURL+urlParams+APIkey+"&query=";

//5a4d4d6fc958354b6d41e922284fec4d
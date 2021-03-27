package cz.vsb.novak.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cs.vsb.novak.connector.WeatherstackConnector;

@RestController

public class WeatherController {
	
	@RequestMapping("/weather")
	public String getWeather(){
    	return "Počasí pro všechna města";
}
	
	@RequestMapping("/weather/{city}")
	public String getWeatherForCity(@PathVariable String city){
		WeatherstackConnector connector = new WeatherstackConnector();
    	return connector.getWeatherForCity(city);
	}

}

//public String getWeatherForCity(@PathVariable String city) { return "Počasiii pro mesto   " + city;}
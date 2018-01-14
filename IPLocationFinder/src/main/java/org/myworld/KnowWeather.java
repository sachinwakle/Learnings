package org.myworld;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class KnowWeather {

	public static void main(String[] args) {

		GlobalWeather globalWeather = new GlobalWeather();
		GlobalWeatherSoap globalWSoap =globalWeather.getGlobalWeatherSoap();
//		System.out.println(globalWSoap.getWeather("New York", "United States"));
		System.out.println(globalWSoap.getCitiesByCountry("India"));
	}

}

package com.java.AnimalBaseDTO.air;

import com.java.util.Constants;

public class Rooster extends Chicken {
	
	@Override
	public void makeSounds() {
		System.out.println("Cock-a-doodle-doo");
	}
	
	public void makeSounds(String language) {
		if(language.equalsIgnoreCase(Constants.DANISH)) {
			System.out.println("kykyliky");
		} else if(language.equalsIgnoreCase(Constants.DUTCH)) {
			System.out.println("kukeleku");
		} else if(language.equalsIgnoreCase(Constants.FILIPINO)) {
			System.out.println("kokkororo");
		} else if(language.equalsIgnoreCase(Constants.FINNISH)) {
			System.out.println("kukko kiekuu");
		} else if(language.equalsIgnoreCase(Constants.FRENCH)) {
			System.out.println("cocorico");
		} else if(language.equalsIgnoreCase(Constants.GERMAN)) {
			System.out.println("kikeriki");
		} else if(language.equalsIgnoreCase(Constants.GREEK)) {
			System.out.println("kikiriki");
		} else if(language.equalsIgnoreCase(Constants.HEBREW)) {
			System.out.println("coo-koo-ri-koo");
		} else if(language.equalsIgnoreCase(Constants.HUNGARIAN)) {
			System.out.println("kukuriku");
		} else if(language.equalsIgnoreCase(Constants.ITALIAN)) {
			System.out.println("chicchirichi");
		} else if(language.equalsIgnoreCase(Constants.JAPANESE)) {
			System.out.println("ko-ke-kok-ko-o");
		} else if(language.equalsIgnoreCase(Constants.PORTUGUESE)) {
			System.out.println("cucurucu");
		} else if(language.equalsIgnoreCase(Constants.RUSSIAN)) {
			System.out.println("kukareku");
		} else if(language.equalsIgnoreCase(Constants.SWEDISH)) {
			System.out.println("kuckeliku");
		} else if(language.equalsIgnoreCase(Constants.TURKISH)) {
			System.out.println("kuk-kurri-kuuu");
		} else if(language.equalsIgnoreCase(Constants.URDU)) {
			System.out.println("kuklooku");
		}
	}
}

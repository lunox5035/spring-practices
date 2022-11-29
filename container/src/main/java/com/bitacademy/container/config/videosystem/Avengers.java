package com.bitacademy.container.config.videosystem;

public class Avengers {
	private String studio = "MARVEL";
	private String title = "Avengers";
	
	@Override
	public String play() {
		return "Playing Movie " + studio + "'s " + title;
	}
	
}

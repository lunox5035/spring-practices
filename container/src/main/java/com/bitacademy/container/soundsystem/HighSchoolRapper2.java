package com.bitacademy.container.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HighSchoolRapper2 implements compactDisc {
	private String artist = "김하은" ;
	private String title = "붕붕" ;
		

	
	@Override
	public String play() {
		return "playing "+title+" by "+artist;

	}

}

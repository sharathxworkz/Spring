package com.xworkz.musicAndFood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MusicDTO {
	
	private String songName;
	private String singerName;
	private String duration;
	private String producer;
	private String lyricsWriter;
	private String language;
	private String type;

	public MusicDTO() {
		
		System.out.println("Calling Default Constructor of:"+ this.getClass().getSimpleName());
	}
}

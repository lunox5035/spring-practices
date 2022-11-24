package com.bitacademy.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bitacademy.container.config.videosystem.DVDPlayerConfig;

public class DVDPlayerConfigTest {
	@ExtendWith(SpringExtension.class)
	@ContextConfiguration(classes= {DVDPlayerConfig.class })
	public class DVDlayerConfigTest {
		
		//같은 타입의 Bean이 두개 이상 있는 경우
		//설정클래스의 빈 생성 메소드의 이름을 지정
		@Autowired
		@Qualifier("dvdPlayer1")
//		private DVDPlayer dvdPlayer;
		private DVDPlayer dvdPlayer1;

		//같은 타입의 Bean이 두개 이상 있는 경우
		//설정클래스의 빈 생성 메소드의 @Bean의 name 속성의 값을 사용
		@Autowired
		private DVDPlayer dvdPlayer2;
		
		@Test
		public void testDVDPlayerNotNull() {
		assertNotNull(dvdPlayer1); 
		assertNotNull(dvdPlayer2); 
		assertNotNull(dvdPlayer3); 
			
		}
		
		@Test
		public void testPlay() {
			assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer1.play());
			assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer2.play());
			assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer3.play());
			}
	
	}
}

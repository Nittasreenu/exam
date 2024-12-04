package com.codinghub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configgg
{
	@Bean
	public PLAYERS player()
	{
		PLAYERS p=new PLAYERS("bhargav",5,"LbStadium",500);
		return p;
	}
	
}

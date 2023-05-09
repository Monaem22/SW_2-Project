package com.pharmcy.meds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@SpringBootApplication
public class MedsApplication {


	public static void main(String[] args) {
		SpringApplication.run(MedsApplication.class, args);
	}


}

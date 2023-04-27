package org.koreait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exam01Application {  //이 안에서 스프링 범위가 모두 적용된다.

	public static void main(String[] args) {

		SpringApplication.run(Exam01Application.class, args);
	}

}

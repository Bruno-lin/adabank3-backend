package com.brunolin.adabank3;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bruno
 */
@SpringBootApplication
@MapperScan(basePackages = "mapper")
public class Adabank3Application {

	public static void main(String[] args) {
		SpringApplication.run(Adabank3Application.class, args);
	}

}

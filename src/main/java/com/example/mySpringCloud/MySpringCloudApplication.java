package com.example.mySpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author shijy
 */
@SpringBootApplication
@EnableBinding(Sink.class)
public class MySpringCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySpringCloudApplication.class, args);
        System.out.println("加载springCloud......");
	}

}

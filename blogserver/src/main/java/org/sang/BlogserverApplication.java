package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//开启定时任务支持122223
public class BlogserverApplication {

    public static void main(String[] args) {
    	System.out.println("111");
        SpringApplication.run(BlogserverApplication.class, args);
    }
}

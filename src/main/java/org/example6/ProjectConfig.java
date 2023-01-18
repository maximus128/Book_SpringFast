package org.example6;

import org.example6.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example6.repositories", "org.example6.services"})
public class ProjectConfig {

//    @Bean
//    public CommentService commentService(){
//        return new CommentService();
//    }
}

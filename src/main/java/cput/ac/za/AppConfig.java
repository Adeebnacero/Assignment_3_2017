package cput.ac.za;

import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
public class AppConfig{

    @Bean(name = "description")
    public Question2Interface getCar(){

        return new Question2Impl();
    }
}

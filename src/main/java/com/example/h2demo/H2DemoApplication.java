package com.example.h2demo;

import com.example.h2demo.model.Book;
import com.example.h2demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2DemoApplication.class, args);
    }

    // add row to database, data seeding
    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            repository.save(new Book(null, "Spring Boot: Up and Running", 328, "Teehee"));
        };

    }

}

//  Extra fun stuff logging info and look for database name
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(H2DemoApplication.class, args);
//		Object dataSource = context.getBean("dataSource");
//		System.out.println(dataSource);
//	}

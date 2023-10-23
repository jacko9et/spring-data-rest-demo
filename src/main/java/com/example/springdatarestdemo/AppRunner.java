package com.example.springdatarestdemo;

import com.example.springdatarestdemo.domain.Resource;
import com.example.springdatarestdemo.domain.ResourceRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AppRunner implements ApplicationRunner {

    private final ResourceRepository resourceRepository;

    public AppRunner(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        // http://localhost:8080/resources/2cf26c78-4429-41f0-8560-b1bc99e7fb4f
        resourceRepository.save(
                Resource
                        .builder()
                        .id(UUID.fromString("2cf26c78-4429-41f0-8560-b1bc99e7fb4f"))
                        .name("test")
                        .build());
    }
}

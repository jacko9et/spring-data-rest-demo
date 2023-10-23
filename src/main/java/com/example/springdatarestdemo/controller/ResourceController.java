package com.example.springdatarestdemo.controller;

import com.example.springdatarestdemo.domain.Resource;
import org.springframework.data.rest.core.AggregateReference;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@BasePathAwareController(path = "/resources")
public class ResourceController {

    @GetMapping(path = "/search/test")
    void searchTest(@RequestParam AggregateReference<Resource, UUID> reference) {
        // http://localhost:8080/resources/search/test?reference=http://localhost:8080/resources/2cf26c78-4429-41f0-8560-b1bc99e7fb4f
        System.out.println(reference.resolveAggregate());
    }

}

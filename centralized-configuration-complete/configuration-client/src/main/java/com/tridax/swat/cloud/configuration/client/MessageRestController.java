package com.tridax.swat.cloud.configuration.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    @Autowired
    private PropertyConfiguration propertyConfiguration;

    @RequestMapping("/message")
    String getMessage() {
        return this.propertyConfiguration.getMessage();
    }
}

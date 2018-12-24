package com.ideal.springbootjsonorxmldemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //http://localhost:8082/json
    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public IUser index(){
        IUser user = new IUser("dalaoyang", "26", "北京");
        return user;
    }


    //http://localhost:8082/xml
    @GetMapping(value = "/xml",produces = MediaType.APPLICATION_XML_VALUE)
    public IUser XML(){
        IUser user = new IUser("dalaoyang", "26", "北京");
        return user;
    }
}

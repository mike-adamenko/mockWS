package com.adamenko.mockws;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping(value = "mock1", method = RequestMethod.GET)
    public MockEntity1 getMockEntity1() {
        return new MockEntity1();
    }

    @RequestMapping(value = "mock1", method = RequestMethod.POST)
    public MockEntity1 getMockEntity1(@RequestBody MockEntity1 mockEntity1) {
        return new MockEntity1(mockEntity1.getProperty1(), mockEntity1.getProperty2());
    }
}

package com.farseer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by greenday on 17/09/2017.
 */
@Controller
public class MainController {

    @ResponseBody
    @RequestMapping(value = "/test.do", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/getname", method = RequestMethod.GET)
    public String getName(String params) {
        return "Hello names";
    }
}

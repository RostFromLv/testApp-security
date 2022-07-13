package com.security.testappsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/v1")
public class TextController {

  @GetMapping("/text")
  public String getText(){
    return "Hello my dear friend!";
  }

}

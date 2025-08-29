package ro.meets.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.meets.entity.Config;

@RestController
public class StatusController {
  @RequestMapping("/status")
  public Config status () {
    return new Config("Application is up & running!");
  }
}

package ro.meets.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserApiController {

  @Value("${spring.application.name}")
  private String appName;

  @RequestMapping("/index")
  public String index() {
    System.out.println(appName);
    return "index.html";
  }
  
}
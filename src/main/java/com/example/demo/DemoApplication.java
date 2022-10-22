package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  /**
   * Hello，World
   *
   * @param who
   * @return Hello, ${who}
   */
  @GetMapping("/hello")
  public String sayHello(
    @RequestParam(required = false, name = "who") String who
  ) {
    if (who == null) {
      who = "World";
    }
    return "Hello, " + who + "!";
  }
}

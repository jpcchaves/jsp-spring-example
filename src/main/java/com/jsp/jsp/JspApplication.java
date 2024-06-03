package com.jsp.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.jsp.jsp")
public class JspApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(JspApplication.class, args);
  }
}

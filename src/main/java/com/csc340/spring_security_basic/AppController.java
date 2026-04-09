package com.csc340.spring_security_basic;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
  @GetMapping("/")
  public String index() {
    return "home";
  }

  @GetMapping("/home")
  public String home() {
    return "home";
  }

  @GetMapping("/admin")
  public String adminHello(Model model) {
    String name = SecurityContextHolder.getContext().getAuthentication().getName();
    model.addAttribute("currentUser", name);
    return "admin";
  }

  @GetMapping("/mod")
  public String modHello(Model model) {
    String name = SecurityContextHolder.getContext().getAuthentication().getName();
    model.addAttribute("currentUser", name);
    return "mod";
  }

  @GetMapping("/hello")
  public String hello(Model model) {
    String name = SecurityContextHolder.getContext().getAuthentication().getName();
    model.addAttribute("currentUser", name);
    return "hello";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @GetMapping("/403")
  public String _403() {
    return "403";
  }
}

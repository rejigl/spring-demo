package com.rejigl.spring.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    public void sayHello() {
      HelloController controller = new HelloController();
      Model model = new BindingAwareModelMap();
      String result = controller.sayHello("World", model);
      assertEquals("hello", result);
      assertEquals("World", model.asMap().get("user"));
    }

}
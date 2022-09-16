package com.boot.mvc20220916junil.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class PageController {

    @GetMapping({"/", "/index"})
    public String loadIndex(Model model) {
        model.addAttribute("name", "김준일");
        return "index";
    }

    @GetMapping("/helloboot")
    public String loadHelloBoot(Model model) {
        model.addAttribute("nowDate", LocalDateTime.now());
        return "hello";
    }

    @GetMapping("/myinfo")
    public String loadMyinfo(Model model) {
        model.addAttribute("name", "김준일");
        model.addAttribute("age", "29");
        model.addAttribute("phone", "010-9988-1916");
        model.addAttribute("address", "부산 동래구 사직동");
        return "myinfo";
    }
}

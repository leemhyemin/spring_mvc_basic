package com.spring.mvc.basic.controller.v2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasucV2Controller {
    //@ResponseBody 붙이면 문자열이 그대로 브라우저에게 전달됨
    // 뗀 순간 문자열의 경로에 있는 파일을 열어줌
    @GetMapping("/join")
    public String join() {
        return "/register.html"; // 열어줄 파일의 경로
    }

    @GetMapping("/gugudan")
    public String gugudan() {
        return ("/common/gugu3.html"); //경로
    }
}
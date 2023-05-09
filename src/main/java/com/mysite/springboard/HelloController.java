package com.mysite.springboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Controller - 클라이언트의 요청을 처리하는 클래스
@Controller
public class HelloController {
    @GetMapping("/hello") // ~/hello URL로 GET요청이 발생하면 hello 메서드가 실행됨 (Post 요청은 PostMapping 사용)
    @ResponseBody   // hello메서드의 응답 결과가 문자열 그 자체임을 나타냄
    public String hello() {
        return "Hello Spring Board";
    }
}

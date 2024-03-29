package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        /**스프링 부트 thymeleaf viewName 매핑
        resources:templates/ +{ViewName}+ .html*/
        return "hello";
    }
}

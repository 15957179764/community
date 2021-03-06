package wang.bottom.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller     // 主要用于Spring容器识别这是一个前端控制页面，用于页面跳转等
public class HelloController {

    @GetMapping("/hello")	//如上面提到的路由，
    public String hello(@RequestParam(value="name") String name, Model model){  // 前面提到的传递的参数，如name=张三
        model.addAttribute("nickname", name);	 // 将浏览器传来的参数设置到model中，用于后端页面获取
        return "hello";	 // 默认将跳转到resources/templates/hello.html
    }

}

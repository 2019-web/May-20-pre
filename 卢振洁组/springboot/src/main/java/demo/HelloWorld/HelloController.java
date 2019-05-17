package demo.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World!!";
    }

    @RequestMapping("/hello2")
    public String sayHello2(){return "我是測試熱部署的！！";}
}

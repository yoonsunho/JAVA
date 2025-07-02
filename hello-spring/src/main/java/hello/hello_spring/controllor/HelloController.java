package hello.hello_spring.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")//url 매핑 주소
    public String hello(Model model){
        model.addAttribute("data","hello!! ");
        return "hello";  // resources/templates/hello.html찾아감
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(name = "name",required = false) String name, Model model ){
        model.addAttribute("name",name);
        return "hello-template";
    }

    /*
    @ResponseBody가 붙으면 뷰 리졸버 대신 HTTP 메시지 컨버터가 동작하여
    객체를 JSON 등으로 변환해 응답 본문에 담아준다.
     */
    @GetMapping("hello-string")
    @ResponseBody // html파일 필요없음
    public String helloString(@RequestParam("name") String name){
        return "hello " +name;   //" hello spring"
    }

    @GetMapping("hello-api")
    @ResponseBody   //json 형식 반환(기본)
    public Hello helloApi(@RequestParam("name") String name){

        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}

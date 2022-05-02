package com.example.fastlms;

// MainPage helps in mapping logical address with physical file
// the mapping can be applied in methods

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MainPage {
    @RequestMapping("/")
    // request = WEB -> SERVER
    // response = SERVER -> WEB
    // Template engine example:
    // Spring -> MVC (View -> template engine: print content on screen (html))
    // .NET -> MVC (View -> print)
    // python django -> MTV (Template -> print)
    // Back-end 광정에서 View까지 안 가지만 Frontend 과정에서 감
    // V -> HTML --> Web page
    // V -> json --> API
    public String index() {
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        String msg = "<html>" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "<body>" +
                "<p>Hello</p> <p>fastlms website!!!</p>" +
                "<p> 안녕하세요?</p" +
                "</body>" +
                "</html>";
        printWriter.write(msg);
        printWriter.close();
        return msg;
    }

    @RequestMapping("/hi")
    public String hi(){
        return "Hi";

    }

}

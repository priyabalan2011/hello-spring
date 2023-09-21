package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
//    @GetMapping("hello")
//    @ResponseBody
//    public String Hello()
//    {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")

    public String Goodbye()
    {
        return "Goodbye, Spring!";
    }




    //handles request  of the form /hello?name=Launchcode
    //@GetMapping("hello")
    @RequestMapping( method = {RequestMethod.GET, RequestMethod.POST})

    public String hellowithQueryParam(@RequestParam String name)
    {
        return "Hello " + name + "!";
    }

    //handle request of the form /hello/launchcode
    @GetMapping("{name}")

    public String hellowithPathParam(@PathVariable String name)
    {
        return "Hello " + name + "!";
    }

    @GetMapping("form")

    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello'>" +
                        "<input type = 'text' name = 'name' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}

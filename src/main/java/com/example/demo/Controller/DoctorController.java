package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @ResponseBody
    @GetMapping("/doctor/1")
    public String doctor1() {
        return  "William Hartnell";
    }

    @ResponseBody
    @GetMapping("/doctor/10")
    public String doctor10() {
        return "David Tennant";
    }

    @ResponseBody
    @GetMapping("/doctor/13")
    public String doctor13() {
        return "Jodie Whittaker";
    }
}

package example.question.bill_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Scanner;

@Controller
public class PageController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
}

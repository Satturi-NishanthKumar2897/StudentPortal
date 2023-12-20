package com.school.students;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentsView {
    @GetMapping("/index")
    public String home(Model model) {       
        // studentsModel.readExcel();
        return "index";
    }

    @GetMapping("/")
    public String index(Model model) {       
        return "index";
    }
}

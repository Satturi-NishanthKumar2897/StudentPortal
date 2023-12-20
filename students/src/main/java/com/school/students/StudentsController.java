package com.school.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentsController {

    @Autowired
    StudentsModel studentsModel;

    @GetMapping("/fees/{id}")
    public Fees getMethodName(@PathVariable("id") String id) {
        System.out.println(Integer.valueOf(id));
        Fees fees = studentsModel.getFees(Integer.valueOf(id),"term1");
        return fees;
    }
    
}

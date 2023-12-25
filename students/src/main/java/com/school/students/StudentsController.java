package com.school.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentsController {

    @Autowired
    StudentsModel studentsModel;

    @PostMapping("/fees/{id}")
    public Fees getMethodName(@PathVariable("id") String id,@RequestBody Terms term) {
        System.out.println(Integer.valueOf(id));
        System.out.println(term.toString());
        Fees fees = studentsModel.getFees(Integer.valueOf(id),term);
        return fees;
    }
    
}

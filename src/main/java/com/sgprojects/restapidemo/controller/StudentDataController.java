package com.sgprojects.restapidemo.controller;

import com.sgprojects.restapidemo.model.StudentDetails;
import com.sgprojects.restapidemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")

public class StudentDataController {
    @Autowired
    StudentService service;
    public StudentDataController(StudentService service) {
        this.service = service;
    }


    @GetMapping("{id}")
    public StudentDetails getstudentdetails(@PathVariable("id") String StudentId){
        return service.getStudentDetails(StudentId);
        //new StudentDetails("581","Supriya Ganne","CSE","1234567890");
    }
    @GetMapping
    public List<StudentDetails> getAllstudentdetails(){
        return service.getAllStudentsData();
        //new StudentDetails("581","Supriya Ganne","CSE","1234567890");
    }
    @PostMapping
    public String CreateStudentDetails(@RequestBody StudentDetails details){
        service.createStudentDetails(details);
        return "Successfully Created student details";
    }
    @PutMapping
    public String UpdateStudentDetails(@RequestBody StudentDetails details){
        service.updateStudentDetails(details);
        return "Successfully Updated student details";
    }
    @DeleteMapping("{id}")
    public String DeleteStudentDetails(@PathVariable("id") String StudentId){
        service.deleteStudentDetails(StudentId);
        return "Successfully Deleted student details";
    }

}

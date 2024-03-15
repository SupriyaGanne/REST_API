package com.sgprojects.restapidemo.service;

import com.sgprojects.restapidemo.model.StudentDetails;

import java.util.List;

public interface StudentService {
    public String createStudentDetails(StudentDetails details);
    public String updateStudentDetails(StudentDetails details);
    public String deleteStudentDetails(String StudentId);
    public StudentDetails getStudentDetails(String StudentId);
    public List<StudentDetails> getAllStudentsData();



}

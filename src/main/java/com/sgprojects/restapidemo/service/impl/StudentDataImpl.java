package com.sgprojects.restapidemo.service.impl;

import com.sgprojects.restapidemo.model.StudentDetails;
import com.sgprojects.restapidemo.repository.StudentRepo;
import com.sgprojects.restapidemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentDataImpl implements StudentService {
    @Autowired
    StudentRepo repo;

    public StudentDataImpl(StudentRepo repo) {
        this.repo = repo;
    }


    @Override
    public String createStudentDetails(StudentDetails details) {
        repo.save(details);

        return "success";
    }

    @Override
    public String updateStudentDetails(StudentDetails details) {
        repo.save(details);

        return "success";
    }

    @Override
    public String deleteStudentDetails(String StudentId) {
        repo.deleteById(StudentId);
        return "Success";
    }

    @Override
    public StudentDetails getStudentDetails(String StudentId) {
        return repo.findById(StudentId).get();

    }

    @Override
    public List<StudentDetails> getAllStudentsData() {
        return repo.findAll();

    }
}

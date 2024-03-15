package com.sgprojects.restapidemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="student_data")

@Setter
@Getter
@Data

public class StudentDetails {
    @Id

    private String StudentId;
    private String StudentName;
    private String StudentBranch;
    private String StudentPhoneNumber;


    public StudentDetails() {
    }
    public StudentDetails(String studentId, String studentName, String studentBranch, String studentPhoneNumber) {
        StudentId = studentId;
        StudentName = studentName;
        StudentBranch = studentBranch;
        StudentPhoneNumber = studentPhoneNumber;
    }

}

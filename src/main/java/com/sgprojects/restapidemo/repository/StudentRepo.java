package com.sgprojects.restapidemo.repository;

import com.sgprojects.restapidemo.model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends JpaRepository<StudentDetails, String> {


}

package com.sm.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.StudentManagement.entity.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {
	

}

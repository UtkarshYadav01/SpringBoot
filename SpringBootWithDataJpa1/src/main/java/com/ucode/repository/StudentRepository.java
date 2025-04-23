package com.ucode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ucode.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

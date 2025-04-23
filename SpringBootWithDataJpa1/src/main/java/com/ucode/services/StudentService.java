package com.ucode.services;

import com.ucode.entities.Student;

import java.util.List;

public interface StudentService {

	boolean addStudentDetails(Student std);

	List<Student> getAllStdDetails();
	Student getStdDetails(long id);

	boolean updateStdDetails(long id, float marks);

	boolean deleteStdDetails(long id);
}

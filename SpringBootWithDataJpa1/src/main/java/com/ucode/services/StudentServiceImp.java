package com.ucode.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.ucode.entities.Student;
import com.ucode.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean addStudentDetails(Student std) {

        boolean status = false;

        try {
            studentRepository.save(std);
            status = true;
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Student> getAllStdDetails() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStdDetails(long id) {

        //1st way
        //return studentRepository.findById(1l).get();

        //2nd Way
        //return studentRepository.findById(1l).orElse(null);

        //3rd way
        /*if (byId.isPresent()){
            return byId.get();
        }
        return null;*/

        //4th way
        Optional<Student> byId = studentRepository.findById(id);
        return byId.orElse(null);
    }

    @Override
    public boolean updateStdDetails(long id, float marks) {

        Student student = getStdDetails(id);
        if (student != null) {
            student.setMarks(marks);
            studentRepository.save(student);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteStdDetails(long id) {

        boolean status =false;
        try {
            studentRepository.deleteById(id);
            status=true;
        } catch (Exception e) {
            status=false;
            e.printStackTrace();
        }
        return status;
    }

}

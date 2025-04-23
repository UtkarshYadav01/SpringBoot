package com.ucode;

import com.ucode.entities.Student;
import com.ucode.services.StudentServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootWithDataJpa1Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootWithDataJpa1Application.class, args);
        StudentServiceImp stdService = context.getBean(StudentServiceImp.class);

        //-----------------------INSERT OPERATION-----------------------------------
        /*Student student = new Student();
        student.setName("BOOB");
        student.setRollNo(10432);
        student.setMarks(92.1f);

        boolean b = stdService.addStudentDetails(student);
        if (b) {
            System.out.println("######### STUDENT DETAILS ADDED SUCCESSFULLY ########");
        } else {
            System.out.println("######### STUDENT DETAILS NOT ADDED DUE TO SOME ERROR ########");
        }*/
        //-----------------------SELECT ALL OPERATION -----------------------------------
        List<Student> allStdDetails = stdService.getAllStdDetails();
        System.out.println("_______________________");
        allStdDetails.forEach(System.out::println);
        System.out.println("------------------------");
        //-----------------------SELECT ONE STUDENT -----------------------------------
        /*Student stdDetails = stdService.getStdDetails(14l);
        if (stdDetails != null) {
            System.out.println(stdDetails);
        }else System.out.println("STUDENT NOT FOUND");*/
        //-----------------------UPDATE OPERATION------------------------------------
        /*boolean b = stdService.updateStdDetails(1, 99.9f);
        if (b) {
            System.out.println("######### STUDENT DETAILS UPDATED SUCCESSFULLY ########");
        } else {
            System.out.println("######### STUDENT DETAILS NOT UPDATED DUE TO SOME ERROR ########");
        }*/
        //-----------------------DELETE OPERATION------------------------------------
        /*boolean b = stdService.deleteStdDetails(3);
        if (b) {
            System.out.println("######### STUDENT DELETED SUCCESSFULLY ########");
        } else {
            System.out.println("######### STUDENT NOT DELETED DUE TO SOME ERROR ########");
        }*/
    }
}

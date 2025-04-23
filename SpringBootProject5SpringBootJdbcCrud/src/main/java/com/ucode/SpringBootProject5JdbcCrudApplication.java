package com.ucode;

import com.ucode.dao.UserDao;
import com.ucode.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringBootProject5JdbcCrudApplication {

	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject5JdbcCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return args ->{
			//-----------------------INSERT OPERATION------------------------------------
			/*User user = new User("Ajay", "Ajay@Gmail.com", "Male", "Delhi");
			boolean b = userDao.insertUser(user);
			if (b){
				System.out.println("User inserted successfully");
			}else {
				System.out.println("User not inserted due to some error");
			}*/
			//-----------------------UPDATE OPERATION 1 ------------------------------------
			/*User user = new User("Ajay", "Ajay@Gmail.com", "Male", "Delhi");
			boolean b = userDao.updateUser(user);
			if (b){
				System.out.println("User updated successfully");
			}else {
				System.out.println("User not updated due to some error");
			}*/
			//-----------------------UPDATE OPERATION 2 ------------------------------------
			/*User user = userDao.getUserByEmail("Ajay@Gmail.com");
			user.setCity("Gurgaon");
			boolean b = userDao.updateUser(user);
			if (b){
				System.out.println("User updated successfully");
			}else {
				System.out.println("User not updated due to some error");
			}*/
			//-----------------------DELETE OPERATION------------------------------------
			/*boolean b = userDao.deleteUserByEmail("Ajay@Gmail.com");
			if (b){
				System.out.println("User deleted successfully");
			}else {
				System.out.println("User not deleted due to some error");
			}*/
			//-----------------------SELECT ONE USER -----------------------------------
			/*User userByEmail = userDao.getUserByEmail("Ajay@Gmail.com");
			System.out.println(userByEmail);*/
			//-----------------------SELECT ALL USERS -----------------------------------
			List<User> users = userDao.getAllUsers();
			System.out.println("--------------");
			users.forEach(System.out::println);
			System.out.println("--------------");
		};
	}
}

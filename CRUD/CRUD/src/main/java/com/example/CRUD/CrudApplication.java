package com.example.CRUD;

import com.example.CRUD.DAO.usersDAO;
import com.example.CRUD.entity.Users;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(usersDAO dao){
	return runner -> {
		System.out.println("Hello kub");
		//saveData(dao);
		//deleteData(dao);
		getData(dao);
		//getAllData(dao);
		//updateData(dao);
		};
	}

	public void saveData(usersDAO dao){
	Users user =new Users("Teacher","TU","Test6.jar@");
	dao.save(user);
	System.out.println("Insert complete");
	}

	public void deleteData(usersDAO dao){
	 	int id=3;
		 dao.delete(id);
		System.out.println("delete complete");

	}

	public  void getData(usersDAO dao){
		int id=1;
		Users user=dao.get(id);
		System.out.println(user);
	}
	public void getAllData(usersDAO dao){
		List<Users> data = dao.getAll();
		for(Users i:data){
			System.out.println(i);
		}
	}
	public void updateData(usersDAO dao){
		int id=5;
		Users user = dao.get(5);
		user.setFirstName("Student");
		user.setLastName("TU");
		dao.update(user);
		System.out.println("update complete");

	}
}

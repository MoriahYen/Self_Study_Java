package com.example.SpringJDBCEx;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.service.StudentService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import java.net.spi.InetAddressResolverProvider;
import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Navin");
		s.setMarks(78);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);
	}
}

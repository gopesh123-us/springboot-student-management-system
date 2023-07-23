package tech.luv2code.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.luv2code.sms.entity.Student;
import tech.luv2code.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Hello Students!! ");
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// insert some students
		/*
		 * Student student1 = new Student("Guruji", "Bhagwan",
		 * "gurujipuri@hotmail.com"); Student student2 = new Student("Vaishali",
		 * "Sharma", "vaishali@gmail.com"); Student student3 = new Student("Kirti",
		 * "Sharma", "kirti@gmail.com"); studentRepository.save(student1);
		 * studentRepository.save(student2); studentRepository.save(student3);
		 */
		
	}

}

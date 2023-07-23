package tech.luv2code.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import tech.luv2code.sms.entity.Student;
import tech.luv2code.sms.repository.StudentRepository;
import tech.luv2code.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
}

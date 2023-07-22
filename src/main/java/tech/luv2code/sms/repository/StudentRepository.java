package tech.luv2code.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.luv2code.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

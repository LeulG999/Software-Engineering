package edu.miu.mystudentmgmt.repository;


import edu.miu.mystudentmgmt.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

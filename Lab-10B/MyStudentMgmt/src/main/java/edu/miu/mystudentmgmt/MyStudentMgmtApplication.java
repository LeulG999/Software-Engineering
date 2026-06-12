package edu.miu.mystudentmgmt;

import edu.miu.mystudentmgmt.model.Classroom;
import edu.miu.mystudentmgmt.model.Course;
import edu.miu.mystudentmgmt.model.Student;
import edu.miu.mystudentmgmt.model.Transcript;
import edu.miu.mystudentmgmt.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtApplication implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public MyStudentMgmtApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Course cs401 = new Course();
        cs401.setCourseCode("CS401");
        cs401.setCourseName("Modern Programming Practices");

        Course cs472 = new Course();
        cs472.setCourseCode("CS472");
        cs472.setCourseName("Web Application Programming");

        Course cs425 = new Course();
        cs425.setCourseCode("CS425");
        cs425.setCourseName("Software Engineering");

        Classroom classroom = new Classroom();
        classroom.setBuildingName("McLaughlin Building");
        classroom.setRoomNumber("M105");

        Transcript t1 = new Transcript();
        t1.setDegreeTitle("BS Computer Science");

        Student s1 = new Student();
        s1.setStudentNumber("000-61-0001");
        s1.setFirstName("Anna");
        s1.setMiddleName("Lynn");
        s1.setLastName("Smith");
        s1.setCgpa(3.45);
        s1.setDateOfEnrollment(LocalDate.of(2019, 5, 24));
        s1.setTranscript(t1);
        s1.setClassroom(classroom);
        s1.getCourses().add(cs401);
        s1.getCourses().add(cs472);
        s1.getCourses().add(cs425);

        Transcript t2 = new Transcript();
        t2.setDegreeTitle("BS Software Engineering");

        Student s2 = new Student();
        s2.setStudentNumber("000-61-0002");
        s2.setFirstName("Bob");
        s2.setMiddleName("James");
        s2.setLastName("Johnson");
        s2.setCgpa(3.80);
        s2.setDateOfEnrollment(LocalDate.of(2020, 1, 15));
        s2.setTranscript(t2);
        s2.setClassroom(classroom);
        s2.getCourses().add(cs401);
        s2.getCourses().add(cs425);

        Transcript t3 = new Transcript();
        t3.setDegreeTitle("BS Information Systems");

        Student s3 = new Student();
        s3.setStudentNumber("000-61-0003");
        s3.setFirstName("Carol");
        s3.setMiddleName("Marie");
        s3.setLastName("Davis");
        s3.setCgpa(3.67);
        s3.setDateOfEnrollment(LocalDate.of(2021, 8, 20));
        s3.setTranscript(t3);
        s3.setClassroom(classroom);
        s3.getCourses().add(cs472);
        s3.getCourses().add(cs425);

        Transcript t4 = new Transcript();
        t4.setDegreeTitle("BS Data Science");

        Student s4 = new Student();
        s4.setStudentNumber("000-61-0004");
        s4.setFirstName("David");
        s4.setMiddleName("Lee");
        s4.setLastName("Wilson");
        s4.setCgpa(3.25);
        s4.setDateOfEnrollment(LocalDate.of(2018, 9, 10));
        s4.setTranscript(t4);
        s4.setClassroom(classroom);
        s4.getCourses().add(cs401);
        s4.getCourses().add(cs472);
        s4.getCourses().add(cs425);

        studentRepository.saveAll(List.of(s1, s2, s3, s4));
    }
}
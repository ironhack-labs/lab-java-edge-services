package service;


import org.microservices.feign.StudentInfoClient;
import org.microservices.feign.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.sterotype.Services;

@Service


public class StudentService {
    private final StudentInfoClient studentInfoClient;

    @Autowired

    public StudentService(StudentInfoClient studentInfoClient){
        this.studentInfoClient = studentInfoClient;
    }

    public Student getStudentById(Long id){
        return studentInfoClient.getStudentsById(id);
    }
}

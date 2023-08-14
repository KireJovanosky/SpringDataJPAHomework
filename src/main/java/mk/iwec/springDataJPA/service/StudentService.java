package mk.iwec.springDataJPA.service;

import mk.iwec.springDataJPA.domain.Student;
import mk.iwec.springDataJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> findAll(){
        return repository.findAll();
    }

    public Student findByLastName(String lastName){
        return repository.findByLastNameIgnoreCase(lastName);
    }

    public Optional<Student> findStudentById(Integer id) {
        return repository.findById(id);
    }

    public void insertStudent(Student student) {
        repository.save(student);
    }

    public void updateStudent(Student student) {
        repository.save(student);
    }

    public void deleteStudent(Integer id) {
        repository.deleteById(id);
    }

    public List<Student> findStudentsByGradeBetween(Integer minGrade, Integer maxGrade) {
        return repository.findStudentsByGradeBetween(minGrade, maxGrade);
    }



}

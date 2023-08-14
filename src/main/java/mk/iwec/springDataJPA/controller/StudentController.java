package mk.iwec.springDataJPA.controller;

import mk.iwec.springDataJPA.domain.Student;
import mk.iwec.springDataJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    @ResponseBody
    public Iterable<Student> findAll(){
        return service.findAll();
    }

    @GetMapping("/lastName")
    @ResponseBody
    public Student findStudentByLastName(@RequestParam String lastName){
        return service.findByLastName(lastName);
    }

    @GetMapping("/id")
    @ResponseBody
    public Optional<Student> findStudentByLastName(@RequestParam Integer id){
        return service.findStudentById(id);
    }

    @PostMapping("/insertStudent")
    public void insertStudent(@RequestBody Student student) {
        service.insertStudent(student);
    }

    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody Student student) {
        service.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudentById(@RequestParam Integer id){
        service.deleteStudent(id);
    }

    @GetMapping("/findByGrades")
    @ResponseBody
    public Iterable<Student> findStudentsByGradeBetween(@RequestParam Integer minGrade, @RequestParam Integer maxGrade){
        return service.findStudentsByGradeBetween(minGrade, maxGrade);
    }

}

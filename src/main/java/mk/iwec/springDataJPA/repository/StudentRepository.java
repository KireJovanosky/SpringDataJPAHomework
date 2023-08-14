package mk.iwec.springDataJPA.repository;

import mk.iwec.springDataJPA.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByLastNameIgnoreCase(String lastName);

    List<Student> findStudentsByGradeBetween(Integer minGrade, Integer maxGrade);
}

package co.develhope.email1.Students.services;

import org.springframework.stereotype.Service;
import co.develhope.email1.Students.entities.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "Andrea", "Visentin", "andrea@email.it"),
            new Student("2", "Walter", "White", "walter@white.com"),
            new Student("3", "Samuel", "Dungeon", "samuel@dangeon.com"),
            new Student("4", "Ursula", "Von Der Leyen", "ursula@boss.eu")
            );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromList = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        if(studentFromList.isPresent()) return studentFromList.get();
        return null;
    }
}

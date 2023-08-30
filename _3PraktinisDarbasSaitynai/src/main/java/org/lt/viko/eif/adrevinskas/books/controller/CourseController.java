package org.lt.viko.eif.adrevinskas.books.controller;

import org.lt.viko.eif.adrevinskas.books.exception.ServerNotFoundException;
import org.lt.viko.eif.adrevinskas.books.models.Course;
import org.lt.viko.eif.adrevinskas.books.models.Registration;
import org.lt.viko.eif.adrevinskas.books.models.Student;
import org.lt.viko.eif.adrevinskas.books.repository.CourseRepo;
import org.lt.viko.eif.adrevinskas.books.repository.RegistrationRepo;
import org.lt.viko.eif.adrevinskas.books.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private RegistrationRepo registrationRepo;
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/*")
    String mainMethod(){
        return "Course Selling";
    }

    @PostMapping("/newcourse")
    Course newCourse(@RequestBody Course newCourse) {
        return courseRepo.save(newCourse);
    }
    @PostMapping("/newstudent")
    Student newStudent(@RequestBody Student newStudent) {
        return studentRepo.save(newStudent);
    }

    @GetMapping("/registrations")
    List<Registration> getAllRegistrations() {
        return registrationRepo.findAll();
    }

    @PostMapping("/newregistration")
    Registration newRegistration(@RequestBody Registration newRegistration) {
        return registrationRepo.save(newRegistration);
    }

    @GetMapping("/registrations/count")
    long countRegistrations() {
        return registrationRepo.count();
    }

    @GetMapping("/students/count")
    long countStudents() {
        return studentRepo.count();
    }


    @DeleteMapping("/deletestudent/{id}")
    void deleteAccount(@PathVariable Long id) {
        studentRepo.deleteById(id);
    }

    @DeleteMapping("/deletecourse/{id}")
    void deletePackage(@PathVariable Long id) {
        courseRepo.deleteById(id);
    }

    @GetMapping("/students")
    List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}


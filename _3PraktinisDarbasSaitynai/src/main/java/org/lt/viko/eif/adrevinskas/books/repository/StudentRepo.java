package org.lt.viko.eif.adrevinskas.books.repository;

import org.lt.viko.eif.adrevinskas.books.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}

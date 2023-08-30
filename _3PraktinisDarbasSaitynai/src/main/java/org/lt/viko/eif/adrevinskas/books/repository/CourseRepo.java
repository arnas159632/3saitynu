package org.lt.viko.eif.adrevinskas.books.repository;

import org.lt.viko.eif.adrevinskas.books.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {
}

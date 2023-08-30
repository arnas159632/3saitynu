package org.lt.viko.eif.adrevinskas.books.repository;

import org.lt.viko.eif.adrevinskas.books.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration, Long> {
}

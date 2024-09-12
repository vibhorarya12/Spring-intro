package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.Students;

import java.util.List;
import java.util.Optional;

public interface StudentsService {
    List<Students> findAllStudents();
    Optional<Students> findById(Long id);
    Students saveStudent (Students std);

}

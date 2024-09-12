package net.engineeringdigest.journalApp.service.implement;

import net.engineeringdigest.journalApp.entity.Students;
import net.engineeringdigest.journalApp.repository.StudentRepository;
import net.engineeringdigest.journalApp.service.StudentsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentServiceImplement implements StudentsService {


    public  final StudentRepository studentRepository;

    public  StudentServiceImplement (StudentRepository studentRepository){
         this.studentRepository = studentRepository;
    }

    @Override
    public List<Students> findAllStudents(){
        return  studentRepository.findAll();
    }

    @Override
  public Optional<Students> findById(Long id){
        return  studentRepository.findById(id);
    }

    @Override
    public  Students saveStudent (Students std){
        return  studentRepository.save(std);
    }

}

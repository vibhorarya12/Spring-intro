package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.Students;
import net.engineeringdigest.journalApp.service.StudentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {
    public StudentsService studentsService;
    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @PostMapping("save-student")
    public Students saveStudent(@RequestBody Students student){
        return  studentsService.saveStudent(student);
    }
    @GetMapping("get-all")
    public List<Students> getAll(){
        return  studentsService.findAllStudents();
    }


}

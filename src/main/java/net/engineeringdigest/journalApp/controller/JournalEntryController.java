package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entries.Employees;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @GetMapping("Employees")
  public  String Employees(){
       return "these are all employees";
  }

  @PostMapping("set-employees")
  public Employees  register (@RequestBody Employees emp){
        return  emp;
  }

}

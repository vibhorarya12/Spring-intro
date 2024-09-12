package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entries.Employees;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private HashMap<String, Employees> entries = new HashMap<>();
    // register an employee
    @PostMapping("register")
    public  boolean register (@RequestBody Employees emp){
        entries.put(emp.getId(), emp);
        return true;

    }

    // get all employees //
    @GetMapping("getAll")
    public HashMap<String, Employees> getAll() {
        return entries;
    }

    // get employee by id //
    @GetMapping("id/{empID}")
    public  ResponseEntity<?> getById(@PathVariable Long  empID){

         if(entries.containsKey(empID.toString())){

             return new ResponseEntity<>(entries.get(empID.toString()), HttpStatus.OK);
         }

          return new ResponseEntity<>( "No record found", HttpStatus.NOT_FOUND);
    }


}

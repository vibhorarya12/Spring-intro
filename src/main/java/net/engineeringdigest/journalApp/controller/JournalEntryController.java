package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entries.Employees;
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
    public  Employees getById(@PathVariable Long  empID){
          return  entries.get(empID.toString());
    }


}

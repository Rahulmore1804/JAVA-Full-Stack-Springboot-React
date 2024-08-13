package com.fullstack.fullstack.controller;

import com.fullstack.fullstack.Services.EmpServices;
import com.fullstack.fullstack.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
public class EmployeeController {
    @Autowired
   private EmpServices empServices;
    @GetMapping("/home")
    public String callGet() {
        return "get";
    }
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return empServices.getEmplist();
    }
    @PostMapping("/addemployee")
    public Employee addEmp(@RequestBody Employee emp){
        return empServices.addEmp(emp);
    }

}

//












//@CrossOrigin(origins = "http://localhost:8081")
//@RestController
//@RequestMapping("/api")
//public class TutorialController {
//
//    @Autowired
//    TutorialRepository tutorialRepository;
//
//    @GetMapping("/tutorials")
//    public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
//    ...
//    }
//
//    @GetMapping("/tutorials/{id}")
//    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
//    ...
//    }
//
//    @PostMapping("/tutorials")
//    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
//    ...
//    }
//
//    @PutMapping("/tutorials/{id}")
//    public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
//    ...
//    }
//
//    @DeleteMapping("/tutorials/{id}")
//    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
//    ...
//    }
//
//    @DeleteMapping("/tutorials")
//    public ResponseEntity<HttpStatus> deleteAllTutorials() {
//    ...
//    }
//
//    @GetMapping("/tutorials/published")
//    public ResponseEntity<List<Tutorial>> findByPublished() {
//    ...
//    }
//}
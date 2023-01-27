package com.avengers.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.net.http.HttpResponse;
import java.util.HashMap;

@RestController
public class StudentController {
@Autowired
StudentService studentService;

    // add student
    @PostMapping("/add-student")
    public ResponseEntity addStudent(@RequestBody Student student){
      String response = studentService.addStudent(student);
      return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @GetMapping("/get-student")
    public ResponseEntity getStudent(@RequestParam("q") int id){
     Student student= studentService.getStudent(id);
     if(student==null)return new ResponseEntity<>(student,HttpStatus.NOT_FOUND);
    else return new ResponseEntity<>(student,HttpStatus.FOUND);
    }
    @DeleteMapping("/delete-student/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int admnNo){
       String response= studentService.deleteStudent(admnNo);
       if(response.equals("invalid student"))
           return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
       else return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }
    @PutMapping("/update-student")
    public ResponseEntity updateStudent(@RequestParam("id") int id,@RequestParam("age") int age){
        String response= studentService.updateStudent(id,age);
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }
}

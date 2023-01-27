package com.avengers.studentManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class StudentRepository {
    HashMap<Integer,Student> hm = new HashMap<>();

    //add student
    public String addStudent(Student student){

       int admnNo = student.getAdmnNo();
       hm.put(admnNo,student);
        return "Student added";
    }
    //get student
    public Student getStudent(int id){
        if(!hm.containsKey(id))
            return null;
        else return hm.get(id);
    }
    //update student
    public String updateStudent(int id,int age){
        if(!hm.containsKey(id))
            return "Invalid id";
        else {
            hm.get(id).setAge(age);
        }
        return "age updated";
    }
    //delete student
    public String deleteStudent(int id){
        if(!hm.containsKey(id))
            return "invalid student";
        else {
            hm.remove(id);
            return "Student deleted";
        }
    }
}

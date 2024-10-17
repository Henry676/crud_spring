package com.example.crudRapido.controller;

import com.example.crudRapido.entity.Student;
import com.example.crudRapido.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "api/v1/students")//Ruta
public class StudentController {

    @Autowired
    private  StudentService studentService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    //Query o consultas (opcional)
    @GetMapping("/{studentId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Student> getById(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUpdate(@RequestBody Student student){//solicitar datos
        studentService.saveOrUpdate(student);
    }

    //Esto ejecuta con pasar el id del estudiante
    @DeleteMapping("/{studentId}")//Quiero recibir el id del estudiante
    public void delete(@PathVariable("studentId") Long studentId){//solicitar datos
        studentService.delete(studentId);
    }


}

package com.example.crudRapido.service;

import com.example.crudRapido.entity.Student;
import com.example.crudRapido.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired//Inyeccion
    StudentRepository studentRepository; //Definicion del repositorio

    public List<Student> getStudents(){
        return studentRepository.findAll();//Busca a todos los elementos y retornarlos
    }

    //Buscar algun elemento a través del id, es opcional ya que no es una lista
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);//Busca a todos los elementos tomando como referencia el id
    }

    //Guardar y actualizar
    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }

    //Borrar
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}

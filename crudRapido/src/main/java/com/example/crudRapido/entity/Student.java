package com.example.crudRapido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data //Esto es lo que hace que se agreguen los setters y getters automaticamente
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Se generara de forma automatica
    private long studentId;
    private String firstName;
    private String lastName;
    @Column(name = "email_address", unique = true, nullable = false)//Esto cambia de nombre a la columna y hace que sea unica
    private String email;


}

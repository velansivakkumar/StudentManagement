// src/main/java/com/techeazy/schoolmanagement/Subject.java
package com.techeazy.schoolmanagement;

import jakarta.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Getters and Setters
}

package dk.sdu.sdu.springbootmvc.demo.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a User.
 * It maps to a database table 'users' with columns 'id' and 'name'.
 */
@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Unique identifier
    
    private String name;  // User name
    
    // Constructors
    public User() {}
    
    public User(String name) {
        this.name = name;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

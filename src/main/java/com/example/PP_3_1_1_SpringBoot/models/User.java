package com.example.PP_3_1_1_SpringBoot.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(name="name")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 1, max = 32, message = "Name should be between 1 and 32")
    private String name;

    @Column(name="lastname")
    @NotEmpty(message = "Lastname should not be empty")
    @Size(min = 1, max = 32, message = "Lastname should be between 1 and 32 characters")
    private String lastname;

    @Column(name="age")
    @Min(value = 0, message = "Age should not be less 0")
    @Max(value = 150, message = "Age should not be more 150")
    private byte age;

    @Column(name="email")
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Not valid email")
    private String email;

    @Column(name="password")
    @NotEmpty(message = "Password should not be empty")
    @Size(min = 8, max = 32, message = "Password should be between 8 and 32 characters")
    private String password;

    //@OneToMany(mappedBy="users")
    //private Set<Role> roles;

    public User() {

    }

    public User(String name, String lastname, byte age, String email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.password = password;
        //this.roles = roles;
    }

    public void setId(long id) {
        this.id = id;
    }

    //Getters and setters for all fields except id(only getter). And toString with using all fields.
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //public Set<Role> getRoles() {
       // return roles;
    //}

    //public void setRoles(Set<Role> roles) {
        //this.roles = roles;
    //}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                //", roles=" + roles +
                '}';
    }
}

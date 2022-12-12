package com.example.PP_3_1_1_SpringBoot.models;


//@Entity
//@Table(name="roles")
public class Role {
    //@Id
    //@GeneratedValue
    private long id;

    //@Column(name="name")
    private String name;

    public Role() {

    }

    public Role(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

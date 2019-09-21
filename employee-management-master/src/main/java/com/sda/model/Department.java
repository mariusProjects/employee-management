package com.sda.model;



import javax.persistence.*;

@Entity
@Table(name="departments")
public class Department {
    @Id
    @Column(name="department_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "name")
    private String name;

    public Department(){}
    public Department(String name){
        this.name = name;
    }

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

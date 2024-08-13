package com.fullstack.fullstack.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "employeeDatabase")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private  String name;

    @Column(name = "salary")

    private float salary;
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(long id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
   public Employee(){
        super();
   }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



}

package org.lt.viko.eif.adrevinskas.books.models;

import jakarta.persistence.*;
import org.lt.viko.eif.adrevinskas.books.repository.StudentRepo;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    private String firstName;
    private String lastName;

    public Student(){}

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}
    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    @Override
    public String toString(){
        return String.format("\tName = %s\n\t\t" + "Last Name = %s\n\t\t",
                this.firstName,
                this.lastName);
    }
}
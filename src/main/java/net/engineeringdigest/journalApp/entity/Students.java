package net.engineeringdigest.journalApp.entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    public  Long id;
    @Column(name = "name")
    public  String name;
    @Column(name = "course")
    public  String course;
    @Column(name = "major")
    public  String  major;
    public Students() {
    }
    public Students(String course, Long id, String name, String major) {
        this.course = course;
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}

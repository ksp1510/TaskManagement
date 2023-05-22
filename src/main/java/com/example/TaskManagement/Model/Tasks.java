package com.example.TaskManagement.Model;


import javax.persistence.*;

@Entity
public class Tasks {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String completed;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private String duedate;


    public Tasks() {
    }


    public Tasks(String title, String description, String completed, String duedate) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.duedate = duedate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
}

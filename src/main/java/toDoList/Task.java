package main.java.toDoList;

import java.util.Date;
import java.util.List;

public class Task {

    private List<Task> subtasks;
    private String title;
    private String  description;
    private  boolean isFinished;
    private Date finishDate;

    public Task(String title, String description){
        this.title= title;
        this.description=description;
    }

}

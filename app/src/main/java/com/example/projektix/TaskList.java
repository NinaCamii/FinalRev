package com.example.projektix;

import android.view.View;

import java.util.ArrayList;
/** creates a task list behind the "my task list" button
 * @author samuel*/
public class TaskList {
    private static final TaskList ourInstance = new TaskList();
    private final String title = "Task";
    ArrayList<Task> Tasks;

    /** gets the task list instance and returns it
     * @returns task list instance*/

    public static TaskList getInstance() {
        return ourInstance;
    }

    /** creates new arraylist with the name of Tasks*/
    private TaskList() {
        Tasks = new ArrayList<>();
    }

    /**@param i the task number
     *@returns a certain task with wanted number*/
    public Task getTask(int i) {
        return Tasks.get(i);
    }
}



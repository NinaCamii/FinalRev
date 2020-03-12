package com.example.projektix;

import android.view.View;

import java.util.ArrayList;
/** creates a task list behind the "my task list" button */
public class TaskList {
    private static final TaskList ourInstance = new TaskList();
    private final String title = "Task";
    ArrayList<Task> Tasks;

    /** */

    public static TaskList getInstance() {
        return ourInstance;
    }

    /**
     * @*/
    private TaskList() {
        Tasks = new ArrayList<>();
    }

    /**
     *@returns */
    public Task getTask(int i) {
        return Tasks.get(i);
    }
}



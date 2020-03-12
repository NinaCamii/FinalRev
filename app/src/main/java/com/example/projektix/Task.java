package com.example.projektix;

/**
 * Determines the names, numbers and statuses of the tasks and returns them for the task list
 * name specifies a name for the task, which is then visible on the task list
 * number is used to id the specific task
 * status shows whether the task is done or not done in the task list view with a checkmark
 * @author samuel
 * @author ninac */

public class Task {
    private int taskNumber;
    private boolean status;
    private String taskName = "Task";

    /** setting the task a name, number and boolean value for status done or not done
     * @param taskName gives the name for the task
     * @param taskNumber gives the task a number id
     * @param status  sets the status as true or false, or done or not done*/
    public Task(String taskName, int taskNumber, boolean status) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.status = status;
    }

    /** method to call the task number
     * @returns the number of the task*/

    public int getTaskNumber() {
        return this.taskNumber;
    }

    /** method to get the task name
     * @returns the name of the task*/

    public String toString() {
        return this.taskName;
    }

}

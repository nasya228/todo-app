package com.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String title) { tasks.add(new Task(title)); }
    public List<Task> getTasks() { return new ArrayList<>(tasks); }
    public int taskCount() { return tasks.size(); }

    public void markTaskDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markDone();
        }
    }
}
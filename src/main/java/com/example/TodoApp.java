package com.example;

public class TodoApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Изучить Git");
        manager.addTask("Настроить CI/CD");
        manager.markTaskDone(0);

        System.out.println("Список задач:");
        for (Task task : manager.getTasks()) {
            System.out.println(task);
        }
        System.out.println("Всего задач: " + manager.taskCount());
    }
}
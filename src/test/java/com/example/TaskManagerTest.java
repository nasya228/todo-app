package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    void addTaskIncreasesCount() {
        TaskManager manager = new TaskManager();
        manager.addTask("Test task");
        assertEquals(1, manager.taskCount());
    }

    @Test
    void markTaskDoneChangesStatus() {
        TaskManager manager = new TaskManager();
        manager.addTask("Test task");
        manager.markTaskDone(0);
        assertTrue(manager.getTasks().get(0).isDone());
    }
}
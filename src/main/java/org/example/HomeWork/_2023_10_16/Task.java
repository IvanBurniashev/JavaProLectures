package org.example.HomeWork._2023_10_16;

import java.util.Date;

public class Task {
    private String title;
    private Date deadline; //(срок выполнения)
    private int priority; //(приоритет)
    private int reward; //(стоимость выполнения)

    public Task(String title, Date deadline, int priority, int reward) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.reward = reward;
    }

//    public double calculatePaymzent();
}

package com.softserve.academy.task560;

import com.softserve.academy.task560.task.Task;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        Map<Integer,Integer> rez = task.run();
        System.out.println(rez);
    }
}

package com.saadaoui.spring;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
    private Queue<T> queue = new LinkedList<>();

    public void enqueue(T item) {
        queue.offer(item);
    }

    public T dequeue() {
        return queue.poll();
    }
}

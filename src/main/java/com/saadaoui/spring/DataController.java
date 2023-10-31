package com.saadaoui.spring;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {
    private final MyList<String> customList = new MyList<>();
    private final MyQueue<Integer> customQueue = new MyQueue<>();

    @PostMapping("/list")
    public void addToList(@RequestBody String item) {
        customList.add(item);
    }

    @GetMapping("/list")
    public List<String> getList() {
        return customList.getAll();
    }

    @PostMapping("/queue")
    public void addToQueue(@RequestBody Integer item) {
        customQueue.enqueue(item);
    }

    @GetMapping("/queue")
    public Integer dequeueFromQueue() {
        return customQueue.dequeue();
    }
}

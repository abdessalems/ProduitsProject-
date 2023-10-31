package com.saadaoui.spring;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public List<T> getAll() {
        return list;
    }
}

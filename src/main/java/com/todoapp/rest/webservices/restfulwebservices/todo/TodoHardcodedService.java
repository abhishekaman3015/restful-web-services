package com.todoapp.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class TodoHardcodedService {

    private static List<Todo> todos= new ArrayList();
    private static int idCounter=0;

    static {
        todos.add(new Todo(++idCounter, "abhishek", "learning to code", new Date(), false));
        todos.add(new Todo(++idCounter, "aman", "learning to sketch", new Date(), false));
        todos.add(new Todo(++idCounter, "ravi", "learning to work", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

}

package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        record User(String name, int age) {}

        var json = """
            {
                "name": "user",
                "age": 30
            }
        """;
        var om = new ObjectMapper();
        var user = om.readValue(json, User.class);

        System.out.println(user);
    }
}
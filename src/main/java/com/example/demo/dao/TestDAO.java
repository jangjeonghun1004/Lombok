package com.example.demo.dao;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestDAO {
    private String id;
    private String pwd;
    private int age;
    private int year;
}

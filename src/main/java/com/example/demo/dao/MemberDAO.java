package com.example.demo.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class MemberDAO {
    private String id;
    private String pwd;
    private int age;
}

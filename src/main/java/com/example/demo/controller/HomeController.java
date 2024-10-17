package com.example.demo.controller;

import com.example.demo.dao.MemberDAO;
import com.example.demo.dao.TestDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("builderTest")
    public String builderTest() {
        MemberDAO memberDAO = MemberDAO.builder()
                .id("id")
                .pwd("123")
                .age(10)
                .build();

        return memberDAO.getId();
    }

    @GetMapping("equalsTest")
    public Boolean equalsTest() {
        MemberDAO memberDAO1 = MemberDAO.builder()
                .id("id")
                .pwd("123")
                .age(10)
                .build();

        MemberDAO memberDAO2 = MemberDAO.builder()
                .id("id")
                .pwd("123")
                .age(100)
                .build();

        return memberDAO1.equals(memberDAO2);
    }

    @GetMapping("hashCodeTest")
    public Boolean hashCodeTest() {
        MemberDAO memberDAO = MemberDAO.builder()
                .id("id")
                .pwd("123")
                .age(10)
                .build();

        TestDAO testDAO = TestDAO.builder()
                .id("id")
                .pwd("123")
                .age(10)
                .build();

        return memberDAO.hashCode() == testDAO.hashCode();
    }

}

package com.example.auth.domain;

import lombok.ToString;

@ToString
public class User {
    Long id;
    String email;
    String passwd;
}

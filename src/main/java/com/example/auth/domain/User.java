package com.example.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class User {

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Info {
        private Long id;
        private String email;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static class Request {
        private String email;
        private String passwd;
    }

    @Getter
    @Setter
    public static class Response {
        private Info info;
    }

}

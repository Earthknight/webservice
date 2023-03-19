package com.example.almtool.dto;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
public class UserLoginRequest {
    private String username;
    private  String password;
}

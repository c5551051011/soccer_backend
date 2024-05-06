package com.soccer.demo.dto;

import com.soccer.demo.type.UserType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private UserType userType;
    private String name;
    private Integer age;
    private Position position;

    public static UserDto fromEntity(User user) {
        return UserDto.builder()
                .userType(user.getUserType())
    }
}


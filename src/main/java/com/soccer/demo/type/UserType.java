package com.soccer.demo.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserType {

    ADMIN("ADMIN", "Admin User"),
    SYSTEM("SYSTEM", "System User"),
    COMMON("COMMON", "Common User")
    ;

    private final String name;
    private final String description;
}

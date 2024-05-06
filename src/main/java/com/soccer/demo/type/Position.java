package com.soccer.demo.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Position {

    WING("WING", "Wing"),
    CENTER_BACK("CENTER_BACK", "Center Back");

    private final String name;
    private final String description;
}

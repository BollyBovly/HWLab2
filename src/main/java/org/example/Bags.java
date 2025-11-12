package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Bags {
    private final Integer weight;
    private final Type type;

    enum Type{
        SAND,
        CEMENT,
        PLASTER
    }
}

package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Boxes {
    private final int length;
    private final int width;
    private final int height;
    private final boolean fragile;

    public int getMaxDimension() {
        return Math.max(length, Math.max(width, height));
    }
}

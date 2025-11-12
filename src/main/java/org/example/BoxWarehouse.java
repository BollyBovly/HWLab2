package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class BoxWarehouse extends Warehouse<Boxes>{
    public List<Boxes> getSortedByLength() {
        return items.stream()
                .sorted(Comparator.comparingInt(Boxes::getMaxDimension).reversed())
                .collect(Collectors.toList());
    }

    public int getFragileAmount() {
        return (int) items.stream()
                .filter(Boxes::isFragile)
                .count();
    }
}

package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class BagWarehouse extends Warehouse<Bags> {
    public Map<Bags.Type, List<Bags>> getSacksByTypes() {
        return items.stream()
                .collect(Collectors.groupingBy(Bags::getType));
    }

    public Set<Bags.Type> getEmptyTypes() {
        Set<Bags.Type> allTypes = EnumSet.allOf(Bags.Type.class);
        Set<Bags.Type> availableTypes = items.stream()
                .map(Bags::getType)
                .collect(Collectors.toSet());

        allTypes.removeAll(availableTypes);
        return allTypes;
    }
}

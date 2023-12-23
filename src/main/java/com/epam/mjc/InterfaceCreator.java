package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> list.stream().map(item -> item / divider).collect(Collectors.toList());
    }
}

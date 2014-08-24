package com.michaeldeluna.tddstarterkit;

import static java.util.Arrays.asList;

public class TddStarterKit {
    public Iterable<String> split(String string) {
        return asList(string.split(" "));
    }
}

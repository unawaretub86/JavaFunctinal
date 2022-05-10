package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {

    @Test
    void steams (){
        List<String> names = List.of("Amigoscode", "Alex", "Zara");
        Stream<String> stream = names.stream();
        stream.limit(2)
                .map(null)
                .sorted(null)
                .dropWhile(null)
                .collect(Collectors.toList());

        String[] namesArray = {};
        Arrays.stream(namesArray);
    }
}

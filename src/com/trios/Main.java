package com.trios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Section B: Streams
        // 1- Create a stream using stream iterator in the pattern 15, 22, 29, 36, … and have it generate up to 100 elements.
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(15, n -> n + 7);

        List<Integer> newList = evenNumInfiniteStream.limit(100)
                .collect(Collectors.toList());
        System.out.println(newList);

        // 2- Filter the stream out to secure only those elements that are multiples of 5.
       newList.stream().filter(z -> z%5==0).forEach(System.out::println);

        //3- Increment the value of each element of the filtered stream by 3.
        newList.stream().filter(z -> z%5==0).map(z -> z+3).forEach(System.out::println);

        //4 - Find the total of the above step by reducing the stream.
        Integer sum = newList.stream().filter(z -> z%5==0).map(z -> z+3).reduce(0, Integer::sum);
        System.out.println(sum); //5- Display the result.

        // 6 - Submit the program to Replit/GitHub as directed by your instructor.






    }
}

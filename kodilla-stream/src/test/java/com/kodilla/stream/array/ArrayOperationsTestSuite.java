package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        //Given
        int[] someNumbers = new int[10];
        someNumbers[0]  = 122;
        someNumbers[1]  = 11;
        someNumbers[2]  = 657;
        someNumbers[3]  = 4456;
        someNumbers[4]  = 761;
        someNumbers[5]  = 1111;
        someNumbers[6]  = 5478;
        someNumbers[7]  = 3222;
        someNumbers[8]  = 5454;
        someNumbers[9]  = 1580;

        //When
        ArrayOperations arrayOperations = numbers -> {
            IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .forEach(System.out::println);

            OptionalDouble avg = IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average();

            return avg.getAsDouble();
        };
        double myDoubleAvg = arrayOperations.getAverage(someNumbers);

        //Then
        Assert.assertEquals(2285.2, myDoubleAvg, 0.001);
    }
}

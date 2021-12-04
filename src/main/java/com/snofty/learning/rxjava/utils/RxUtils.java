package com.snofty.learning.rxjava.utils;

import com.snofty.learning.rxjava.model.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RxUtils {
    private RxUtils() {

    }

    public static List<Car> getRandomCars(int count) {
        return IntStream.range(0, count)
                .mapToObj(operand -> new Car("car-" + operand, operand % 2 == 0 ? 4 : 7))
                .collect(Collectors.toList());
    }


    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

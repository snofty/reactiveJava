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
                .mapToObj(operand -> new Car("car-"+operand, 4))
                .collect(Collectors.toList());
    }


    public static void sleep()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

package com.snofty.learning.rxjava.operator;

import com.snofty.learning.rxjava.observer.DemoObserver;
import com.snofty.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;

public class BufferOperator {
    public static void main(String[] args) {
        Observable.fromIterable(RxUtils.getRandomCars(10))
                .buffer(3)
                .subscribe(new DemoObserver());
    }
}

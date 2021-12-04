package com.snofty.learning.rxjava.operator;

import com.snofty.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;

public class MapOperator {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .map(integer -> 2*integer)
                .subscribe(new DemoObserver());
    }
}

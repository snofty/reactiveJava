package com.snofty.learning.rxjava.operator;

import com.snofty.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;

public class FlatMapOperator {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .flatMap(integer -> Observable
                        .create(observableEmitter -> observableEmitter
                                .onNext(integer * 2)))
                .subscribe(new DemoObserver());
    }
}

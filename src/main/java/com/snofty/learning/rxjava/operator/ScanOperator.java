package com.snofty.learning.rxjava.operator;

import com.snofty.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;

public class ScanOperator {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .scan(Integer::sum)
                .subscribe(new DemoObserver());
    }
}

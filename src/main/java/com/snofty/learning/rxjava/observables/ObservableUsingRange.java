package com.snofty.learning.rxjava.observables;

import com.snofty.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;

public class ObservableUsingRange {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .subscribe(new DemoObserver());
    }
}

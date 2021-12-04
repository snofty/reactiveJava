package com.snofty.learning.rxjava.observables;

import com.snofty.learning.rxjava.observer.DemoObserver;
import com.snofty.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;

public class ObservableUsingDefer {
    public static void main(String[] args) {
        Observable.defer(() -> Observable.fromIterable(RxUtils.getRandomCars(10)))
                .subscribe(new DemoObserver());
    }
}

package com.snofty.learning.rxjava.observables;

import com.snofty.learning.rxjava.observer.DemoObserver;
import com.snofty.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class ObservableWithoutBackpressure {
    public static void main(String[] args) {
        Observable.fromIterable(RxUtils.getRandomCars(1000000))
                .repeat()
                .observeOn(Schedulers.newThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new DemoObserver());

        RxUtils.sleep();
    }
}

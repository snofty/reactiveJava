package com.snofty.learning.rxjava.observables;

import com.snofty.learning.rxjava.observer.DemoObserver;
import com.snofty.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class ObservableUsingInterval {
    public static void main(String[] args) {
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribe(new DemoObserver());
        RxUtils.sleep();
    }

}

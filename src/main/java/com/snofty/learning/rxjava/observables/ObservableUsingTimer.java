package com.snofty.learning.rxjava.observables;

import com.snofty.learning.rxjava.observer.DemoObserver;
import com.snofty.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class ObservableUsingTimer {
    public static void main(String[] args) {
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribe(new DemoObserver());
        RxUtils.sleep();
    }
}

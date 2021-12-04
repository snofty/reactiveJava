package com.snofty.learning.rxjava.observables;

import com.snofty.learning.rxjava.observer.DemoObserver;
import com.snofty.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;

import java.util.concurrent.Callable;

public class ObservableUsingCallable {
    public static void main(String[] args) {
        Callable<String> callable = new Callable<>() {
            @Override
            public String call() throws Exception {
                RxUtils.sleep();
                return "Hi";
            }
        };

        Observable.fromCallable(callable)
                .subscribe(new DemoObserver());
    }
}

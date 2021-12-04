package com.snofty.learning.rxjava.operator;

import com.snofty.learning.rxjava.model.Car;
import com.snofty.learning.rxjava.observer.DemoObserver;
import com.snofty.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.GroupedObservable;
import io.reactivex.schedulers.Schedulers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GroupByOperator {
    private static final Logger LOGGER = LogManager.getLogger(GroupByOperator.class);

    public static void main(String[] args) {
        Observable.fromIterable(RxUtils.getRandomCars(10))
                .groupBy(Car::getCapacity)
                .observeOn(Schedulers.newThread())
                .subscribe(new Observer<GroupedObservable<Integer, Car>>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {
                        LOGGER.info("onSubscribe");
                    }

                    @Override
                    public void onNext(GroupedObservable<Integer, Car> integerCarGroupedObservable) {
                        LOGGER.info("key.. {}", integerCarGroupedObservable.getKey());
                        integerCarGroupedObservable.subscribe(new DemoObserver());
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        LOGGER.info("error -> {}", throwable.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        LOGGER.info("onComplete");
                    }
                });
        RxUtils.sleep(5000);
    }
}

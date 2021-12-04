package com.snofty.learning.rxjava.observables;

import com.snofty.learning.rxjava.model.Car;
import com.snofty.learning.rxjava.observer.DemoObserver;
import com.snofty.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

import java.util.List;

public class ObservableUsingCreate {

    public static void main(String[] args) {
        List<Car> randomCars = RxUtils.getRandomCars(5);
        Observable.create(new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(ObservableEmitter<Object> observableEmitter) throws Exception {
                randomCars.forEach(observableEmitter::onNext);
                observableEmitter.onComplete();
            }
        }).subscribe(new DemoObserver());
    }
}

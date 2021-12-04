package com.snofty.learning.rxjava.observables;

import com.snofty.learning.rxjava.model.Car;
import com.snofty.learning.rxjava.utils.RxUtils;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class FlowableWithBackpressure {
    private static final Logger LOGGER = LogManager.getLogger(FlowableWithBackpressure.class);

    public static void main(String[] args) {
        Flowable.fromIterable(RxUtils.getRandomCars(1000000))
                .repeat()
                .observeOn(Schedulers.newThread(), false, 5)
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Subscriber<Car>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        LOGGER.info("on subscribe");
                    }

                    @Override
                    public void onNext(Car car) {
                        LOGGER.info("on next -> {}", car);
                    }

                    @Override
                    public void onError(Throwable t) {
                        LOGGER.error("");
                    }

                    @Override
                    public void onComplete() {
                        LOGGER.info("onComplete");
                    }
                });
    }
}

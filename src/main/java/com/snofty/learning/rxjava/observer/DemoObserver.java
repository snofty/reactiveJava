package com.snofty.learning.rxjava.observer;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoObserver implements Observer {
    private static final Logger LOGGER = LogManager.getLogger(DemoObserver.class);


    @Override
    public void onSubscribe(Disposable disposable) {
        LOGGER.info("OnSubscribe");
    }

    @Override
    public void onNext(Object o) {
        LOGGER.info("onNext -> {}", o);
    }

    @Override
    public void onError(Throwable throwable) {
        LOGGER.error("onError -> {}", throwable.getMessage());
    }

    @Override
    public void onComplete() {
        LOGGER.info("onComplete");
    }
}

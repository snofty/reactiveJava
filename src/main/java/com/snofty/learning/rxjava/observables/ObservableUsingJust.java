package com.snofty.learning.rxjava.observables;

import com.snofty.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObservableUsingJust {
    private static final Logger logger = LogManager.getLogger(ObservableUsingJust.class);

    public static void main(String[] args) {
        logger.info("Check logger");
        Observable.just('1', '2', '3', '4', '5', '6', '7', '8', '9', '0')
                .subscribe(new DemoObserver());
    }

}

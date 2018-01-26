package com.acercow.rxjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Observable<T> {
    final OnSubscribe<T> onSubscribe;


    private Observable(OnSubscribe<T> onSubscribe) {
        this.onSubscribe = onSubscribe;
    }

    public static <T> Observable<T> create(OnSubscribe<T> onSubscribe) {
        return new Observable<>(onSubscribe);
    }

    public void subscribe(Subscriber<? super T> subscriber) {
        subscriber.onStart();
        onSubscribe.call(subscriber);
    }



    public interface OnSubscribe<T> {
        void call(Subscriber<? super T> subscriber);
    }

    public <R> Observable<R> map(Transformer<? super T, ? extends R> transformer) {
        return create(new OnSubscribe<R>() {
            @Override
            public void call(Subscriber<? super R> subscriber) {
                Observable.this.subscribe(new Subscriber<T>() {

                    @Override
                    public void onComplete() {
                        subscriber.onComplete();
                    }

                    @Override
                    public void onError(Throwable t) {
                        subscriber.onError(t);
                    }

                    @Override
                    public void onNext(T var1) {
                        subscriber.onNext(transformer.call(var1));
                    }
                });
            }
        });
    }

    public interface Transformer<T, R> {
        R call(T from);

    }

}

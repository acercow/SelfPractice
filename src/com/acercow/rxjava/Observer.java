package com.acercow.rxjava;

public interface Observer<T> {
    void onComplete();
    void onError(Throwable t);
    void onNext(T var1);
}

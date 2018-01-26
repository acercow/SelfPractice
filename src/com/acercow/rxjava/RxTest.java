package com.acercow.rxjava;

public class RxTest {
    public static void main(String[] args) {
        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                subscriber.onNext(1);
                subscriber.onNext(2);
                subscriber.onNext(3);
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onStart() {
                super.onStart();
                System.out.println("onStart");
            }

            @Override
            public void onComplete() {

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onNext(Integer var1) {
                System.out.println("subscribe :" + var1);
            }
        });
    }
}

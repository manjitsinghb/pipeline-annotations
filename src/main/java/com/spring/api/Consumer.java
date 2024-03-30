package com.spring.api;

public interface Consumer<C,U,V> {

    void startConsumer(C c);
    V consumeMessage(U u);
}
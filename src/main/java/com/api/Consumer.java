package com.api;

public interface Consumer<U,V> {
    V consumeMessage(U u);
}
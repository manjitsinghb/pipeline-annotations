package com.spring.api;

public interface Transformer <U,V> {

    V transform(U u);
}

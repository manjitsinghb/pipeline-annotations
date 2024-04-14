package com.spring.api;

public interface Consumer<U> {

    U consumeMessage();
}
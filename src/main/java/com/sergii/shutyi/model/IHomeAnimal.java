package com.sergii.shutyi.model;

import com.sergii.shutyi.annotation.MyAnnotation;

public interface IHomeAnimal {
    @MyAnnotation
    void eat();

    @MyAnnotation
    void sleep();

    String getName();

    void setName(String name);
}

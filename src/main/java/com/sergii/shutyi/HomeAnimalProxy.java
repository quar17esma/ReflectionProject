package com.sergii.shutyi;

import com.sergii.shutyi.model.HomeAnimal;
import com.sergii.shutyi.model.IHomeAnimal;

public class HomeAnimalProxy implements IHomeAnimal {

    private HomeAnimal homeAnimal;

    public HomeAnimalProxy(HomeAnimal homeAnimal) {
        this.homeAnimal = homeAnimal;
    }

    @Override
    public void eat() {
        homeAnimal.eat();
    }

    @Override
    public void sleep() {
        homeAnimal.sleep();
    }

    @Override
    public String getName() {
        return homeAnimal.getName();
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException();
    }
}

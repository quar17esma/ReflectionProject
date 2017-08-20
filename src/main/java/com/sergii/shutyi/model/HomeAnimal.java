package com.sergii.shutyi.model;

import com.sergii.shutyi.annotation.MyAnnotation;

@MyAnnotation
public class HomeAnimal extends Animal implements IHomeAnimal {

    private String name;

    public HomeAnimal() {
    }

    public HomeAnimal(String classification, int limbsNumber, int descendantNumber, String name) {
        super(classification, limbsNumber, descendantNumber);
        this.name = name;
    }

    @MyAnnotation
    public void eat() {
        System.out.println("eating");
    }

    @MyAnnotation
    public void sleep() {
        System.out.println("sleeping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeAnimal)) return false;
        if (!super.equals(o)) return false;

        HomeAnimal that = (HomeAnimal) o;

        return getName() != null ? getName().equals(that.getName()) : that.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HomeAnimal{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}

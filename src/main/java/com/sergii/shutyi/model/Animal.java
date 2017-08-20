package com.sergii.shutyi.model;

public class Animal {

    private String classification;

    private int limbsNumber;

    private int descendantNumber;

    public Animal() {
    }

    public Animal(String classification, int limbsNumber, int descendantNumber) {
        this.classification = classification;
        this.limbsNumber = limbsNumber;
        this.descendantNumber = descendantNumber;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getLimbsNumber() {
        return limbsNumber;
    }

    public void setLimbsNumber(int limbsNumber) {
        this.limbsNumber = limbsNumber;
    }

    public int getDescendantNumber() {
        return descendantNumber;
    }

    public void setDescendantNumber(int descendantNumber) {
        this.descendantNumber = descendantNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        if (getLimbsNumber() != animal.getLimbsNumber()) return false;
        if (getDescendantNumber() != animal.getDescendantNumber()) return false;
        return getClassification() != null ? getClassification().equals(animal.getClassification()) : animal.getClassification() == null;
    }

    @Override
    public int hashCode() {
        int result = getClassification() != null ? getClassification().hashCode() : 0;
        result = 31 * result + getLimbsNumber();
        result = 31 * result + getDescendantNumber();
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "classification='" + classification + '\'' +
                ", limbsNumber=" + limbsNumber +
                ", descendantNumber=" + descendantNumber +
                '}';
    }
}

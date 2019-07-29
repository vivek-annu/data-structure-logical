package com.vivek.ds;

/**
 * Created by Vivek on 7/19/2019.
 */
public class Item {
    private  int value;
    private int weight;

    public Item() {
        this.value = value;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

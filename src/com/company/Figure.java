package com.company;

public abstract class Figure implements Drawable{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Figure(String name) {
        this.name = name;
    }
    public abstract int calculatePerimeter();
}

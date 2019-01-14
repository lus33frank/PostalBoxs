package com.box;

public class Box implements BoxInterface {

    protected String name;
    protected float length;
    protected float width;
    protected float height;


    public Box() {
        // 空建構子
    }

    public Box(float length, float width, float height) {
        // 建構子
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public boolean validate(float length, float width, float height) {
        return (this.length > length && this.width > width && this.height > height);
    }

}

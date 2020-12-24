package concreteProduct.shapeImpl;

import abstractProduct.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("The shape is circle");
    }
}

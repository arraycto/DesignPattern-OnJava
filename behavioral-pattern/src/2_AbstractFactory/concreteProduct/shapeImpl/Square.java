package concreteProduct.shapeImpl;


import abstractProduct.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("The shape is square");
    }
}

package client;

import abstractFactory.AbstractFactory2;
import abstractProduct.Color;
import abstractProduct.Shape;
import concreteFactory.ConcreteFactory1;
import concreteFactory.ConcreteFactory2;

public class Client2 {

    public static void main(String[] args) {
        AbstractFactory2 productFamily1 = new ConcreteFactory1(); // 第一个产品族

        Color colorImpl1 = productFamily1.createColor();
        Shape shapeImpl1 = productFamily1.createShape();
        colorImpl1.fill();
        shapeImpl1.draw();

        AbstractFactory2 productFamily2 = new ConcreteFactory2(); // 第一个产品族

        Color colorImpl2 = productFamily2.createColor();
        Shape shapeImpl2 = productFamily2.createShape();
        colorImpl2.fill();
        shapeImpl2.draw();
    }

}

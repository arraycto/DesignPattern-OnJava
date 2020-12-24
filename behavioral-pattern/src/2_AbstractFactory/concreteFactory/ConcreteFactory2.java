package concreteFactory;

import abstractFactory.AbstractFactory2;
import abstractProduct.Color;
import abstractProduct.Shape;
import concreteProduct.colorImpl.Blue;
import concreteProduct.shapeImpl.Circle;

/**
 * 具体工厂类（生成多个产品，产品族）
 */
public class ConcreteFactory2 extends AbstractFactory2 {

    @Override
    public Color createColor() {
        return new Blue();
    }

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
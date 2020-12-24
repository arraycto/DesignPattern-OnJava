package concreteFactory;

import abstractFactory.AbstractFactory2;
import abstractProduct.Color;
import abstractProduct.Shape;
import concreteProduct.colorImpl.Red;
import concreteProduct.shapeImpl.Square;

/**
 * 具体工厂类（生成多个产品，产品族）
 */
public class ConcreteFactory1 extends AbstractFactory2 {

    @Override
    public Color createColor() {
        return new Red();
    }

    @Override
    public Shape createShape() {
        return new Square();
    }
}

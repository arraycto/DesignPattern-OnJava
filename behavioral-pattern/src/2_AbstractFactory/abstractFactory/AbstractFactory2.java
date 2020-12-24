package abstractFactory;

import abstractProduct.Color;
import abstractProduct.Shape;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory2 {

    public abstract Color createColor();
    public abstract Shape createShape();
}

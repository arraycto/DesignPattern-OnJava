package ConcreteFactory;

import concreteProduct.BusImpl2;
import abstratFactory.AbstractFactory1;
import abstractProduct.Bus;

/**
 * 具体工厂
 */
public class BusImpl2Factory1 extends AbstractFactory1 {
    @Override
    public Bus create() {
        return new BusImpl2();
    }
}

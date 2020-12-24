package ConcreteFactory;

import concreteProduct.BusImpl1;
import abstratFactory.AbstractFactory1;
import abstractProduct.Bus;

/**
 * 具体工厂
 */
public class BusImpl1Factory1 extends AbstractFactory1 {
    @Override
    public Bus create() {
        return new BusImpl1();
    }
}

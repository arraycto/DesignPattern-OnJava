package abstratFactory;

import concreteProduct.CarImpl1;
import concreteProduct.CarImpl2;
import abstractProduct.Car;

public class SimpleFactory {

    public Car createCar(int type) {
        if (type == 1) {
            return new CarImpl1();
        } else if (type == 2) {
            return new CarImpl2();
        }
        return null;
    }
}

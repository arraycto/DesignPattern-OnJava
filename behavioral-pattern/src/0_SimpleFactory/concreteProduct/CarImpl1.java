package concreteProduct;

import abstractProduct.Car;

public class CarImpl1 implements Car {
    @Override
    public void run() {
        System.out.println("CarImpl1 is running");
    }

    @Override
    public void stop() {
        System.out.println("CarImpl1 stop running");
    }
}

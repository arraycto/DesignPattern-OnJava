package concreteProduct;

import abstractProduct.Car;

public class CarImpl2 implements Car {
    @Override
    public void run() {
        System.out.println("CarImpl2 is running");
    }

    @Override
    public void stop() {
        System.out.println("CarImpl2 stop running");
    }
}

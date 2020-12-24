package client;

import abstratFactory.SimpleFactory;
import abstractProduct.Car;

public class Client0 {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        Car car1 = simpleFactory.createCar(1);
        car1.run();

        Car car2 = simpleFactory.createCar(2);
        car2.stop();
    }
}

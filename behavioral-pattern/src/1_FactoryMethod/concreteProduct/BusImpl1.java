package concreteProduct;

import abstractProduct.Bus;

public class BusImpl1 implements Bus {
    @Override
    public void run() {
        System.out.println("BusImpl1 is running");
    }

    @Override
    public void stop() {
        System.out.println("BusImpl1 stop running");
    }
}

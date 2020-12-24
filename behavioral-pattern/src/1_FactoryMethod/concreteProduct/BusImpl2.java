package concreteProduct;

import abstractProduct.Bus;

public class BusImpl2 implements Bus {
    @Override
    public void run() {
        System.out.println("BusImpl2 is running");
    }

    @Override
    public void stop() {
        System.out.println("BusImpl2 stop running");
    }
}

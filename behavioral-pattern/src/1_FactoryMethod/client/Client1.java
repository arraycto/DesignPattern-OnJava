package client;

import ConcreteFactory.BusImpl1Factory1;
import ConcreteFactory.BusImpl2Factory1;
import abstratFactory.AbstractFactory1;
import abstractProduct.Bus;

public class Client1 {
    public static void main(String[] args) {
        // 由抽象工厂的子类去实例化产品
        AbstractFactory1 busImpl1Factory = new BusImpl1Factory1();
        Bus busImpl1 = busImpl1Factory.create();
        busImpl1.run();

        AbstractFactory1 busImpl2Factory = new BusImpl2Factory1();
        Bus busImpl2 = busImpl2Factory.create();
        busImpl2.stop();
    }
}

package client;

import abstractBuilder.ComputerBuilder;
import concreteBuilder.LenovoComputerBuilder;
import concreteBuilder.MacComputerBuilder;
import director.ComputerDirector;
import product.Computer;

public class Client3 {

    public static void main(String[] args) {

        // 指挥者
        ComputerDirector computerDirector = new ComputerDirector();

        // Mac Computer 构造者
        ComputerBuilder macComputerBuilder = new MacComputerBuilder("I5 Cpu", "Samsung 125");
        // 指挥者决定使用哪个构造者创建产品
        computerDirector.makeComputer(macComputerBuilder);
        // 获取创建完成后的产品实例
        Computer macComputer = macComputerBuilder.getComputer();
        System.out.println("Mac Computer: " + macComputer.toString());

        // Lenovo Computer 构造者
        ComputerBuilder lenovoComputerBuilder = new LenovoComputerBuilder("I5 Cpu", "Samsung 125");
        // 指挥者决定使用哪个构造者创建产品
        computerDirector.makeComputer(lenovoComputerBuilder);
        // 获取创建完成后的产品实例
        Computer lenovoComputer = lenovoComputerBuilder.getComputer();
        System.out.println("Mac Computer: " + lenovoComputer.toString());


    }
}

package concreteBuilder;

import abstractBuilder.ComputerBuilder;
import product.Computer;

/**
 * Mac Computer 构建者
 */
public class MacComputerBuilder extends ComputerBuilder {

    private Computer computer;

    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("Apple Keyboard");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("Apple Display");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

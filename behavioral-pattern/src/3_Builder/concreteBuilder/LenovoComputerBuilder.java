package concreteBuilder;

import abstractBuilder.ComputerBuilder;
import product.Computer;

/**
 * Lenovo Computer 构建者
 */
public class LenovoComputerBuilder extends ComputerBuilder {

    private Computer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        computer=new Computer(cpu,ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("Lenovo Keyboard");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("Lenovo Display");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

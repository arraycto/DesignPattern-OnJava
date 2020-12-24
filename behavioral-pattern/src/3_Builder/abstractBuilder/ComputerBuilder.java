package abstractBuilder;

import product.Computer;

/**
 * Computer 抽象构建者
 */
public abstract class ComputerBuilder {

    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}

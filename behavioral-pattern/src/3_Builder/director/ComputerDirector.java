package director;

import abstractBuilder.ComputerBuilder;

/**
 * 指挥者
 */
public class ComputerDirector {

    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}

package concreteProduct.colorImpl;

import abstractProduct.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("The color is blue");
    }
}

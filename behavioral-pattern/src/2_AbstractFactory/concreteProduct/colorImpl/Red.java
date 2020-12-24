package concreteProduct.colorImpl;

import abstractProduct.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("The color is red");
    }
}

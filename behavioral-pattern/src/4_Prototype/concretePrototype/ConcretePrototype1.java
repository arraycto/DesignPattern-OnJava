package concretePrototype;

import prototype.Prototype;

public class ConcretePrototype1 implements Prototype {

    private String name;

    public ConcretePrototype1(String name) {
        this.name = name;
    }


    @Override
    public Prototype myClone() {
        return new ConcretePrototype1(name);
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "name='" + name + '\'' +
                '}';
    }
}

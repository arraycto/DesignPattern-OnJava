package concretePrototype;

import prototype.Prototype;

public class ConcretePrototype2 implements Prototype {

    private int age;

    public ConcretePrototype2(int age) {
        this.age = age;
    }

    @Override
    public Prototype myClone() {
        return new ConcretePrototype2(age);
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "age=" + age +
                '}';
    }
}

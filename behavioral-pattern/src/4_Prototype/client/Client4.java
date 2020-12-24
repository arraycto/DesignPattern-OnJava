package client;

import concretePrototype.ConcretePrototype1;
import concretePrototype.ConcretePrototype2;
import prototype.Prototype;

public class Client4 {

    public static void main(String[] args) {

        // 使用原型实例指定要创建对象的类型
        Prototype prototype1 = new ConcretePrototype1("abc");
        // 通过复制这个原型来创建新对象
        Prototype clone1 = prototype1.myClone();
        System.out.println(clone1.toString());

        Prototype prototype2 = new ConcretePrototype2(20);
        Prototype clone2 = prototype2.myClone();
        System.out.println(clone2.toString());
    }
}

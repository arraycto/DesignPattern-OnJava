package client;

import singleton.*;

public class Client5 {

    public static void main(String[] args) {

        /**
         * 线程不安全 懒汉式
         */
        //获取唯一可用的对象
        LazySingleton_Unsafe singleton1 = LazySingleton_Unsafe.getInstance();
        singleton1.showMessage();

        /**
         * 线程安全 懒汉式
         */
        LazySingleton_Safe singleton2 = LazySingleton_Safe.getInstance();
        singleton2.showMessage();

        /**
         * 线程安全 饿汉式
         */
        HungrySingleton_Safe singleton3 = HungrySingleton_Safe.getInstance();
        singleton3.showMessage();

        /**
         * 线程安全 双重校验锁
         */
        DCLSingleton_Safe singleton4 = DCLSingleton_Safe.getInstance();
        singleton4.showMessage();

        /**
         * 线程安全 静态内部类
         */
        StaticInnerClassSingleton_Safe singleton5 = StaticInnerClassSingleton_Safe.getInstance();
        singleton5.showMessage();
    }
}

package singleton;

public class HungrySingleton_Safe {

    // 创建 Singleton 的一个对象并实例化
    private static HungrySingleton_Safe singleton = new HungrySingleton_Safe();

    // 让构造函数为 private，这样该类就不会被外部实例化
    private HungrySingleton_Safe() {

    }

    // 获取唯一可用的对象
    public static HungrySingleton_Safe getInstance() {
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

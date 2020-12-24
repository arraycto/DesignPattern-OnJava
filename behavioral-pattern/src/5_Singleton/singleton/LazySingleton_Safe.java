package singleton;

public class LazySingleton_Safe {

    //创建 Singleton 的一个对象
    private static LazySingleton_Safe singleton;

    // 让构造函数为 private，这样该类就不会被外部实例化
    private LazySingleton_Safe() {

    }

    // 获取唯一可用的对象
    public static synchronized LazySingleton_Safe getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton_Safe();
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

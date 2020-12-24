package singleton;

public class LazySingleton_Unsafe {

    //创建 Singleton 的一个对象
    private static LazySingleton_Unsafe singleton;

    // 让构造函数为 private，这样该类就不会被外部实例化
    private LazySingleton_Unsafe() {

    }

    // 获取唯一可用的对象
    public static LazySingleton_Unsafe getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton_Unsafe();
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

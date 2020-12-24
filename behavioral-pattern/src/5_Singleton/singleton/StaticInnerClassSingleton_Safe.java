package singleton;

public class StaticInnerClassSingleton_Safe {

    private StaticInnerClassSingleton_Safe singleton;

    private static class SingeltonHolder {
        private static final StaticInnerClassSingleton_Safe INSTANCE = new StaticInnerClassSingleton_Safe();
    }

    private StaticInnerClassSingleton_Safe () {

    }

    public static final StaticInnerClassSingleton_Safe getInstance() {
        return  SingeltonHolder.INSTANCE;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

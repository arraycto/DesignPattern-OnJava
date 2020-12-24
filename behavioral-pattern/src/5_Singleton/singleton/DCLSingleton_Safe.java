package singleton;

public class DCLSingleton_Safe {

    private volatile static DCLSingleton_Safe singleton;

    private DCLSingleton_Safe() {

    }

    public static DCLSingleton_Safe getInstance() {
        if (singleton == null) {
            synchronized (DCLSingleton_Safe.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton_Safe();
                }
            }
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

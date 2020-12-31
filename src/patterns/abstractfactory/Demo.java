package patterns.abstractfactory;

public class Demo {

    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = "win";

        if(osName.contains("mac")){
            factory = new MacOSFactory();
            app = new Application(factory);
        }else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }

        return app;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}

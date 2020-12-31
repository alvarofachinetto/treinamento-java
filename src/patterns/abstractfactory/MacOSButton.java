package patterns.abstractfactory;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have create a button for MacOS");
    }
}

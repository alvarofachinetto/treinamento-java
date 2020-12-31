package patterns.abstractfactory;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have create CheckBox for MacOS");
    }
}

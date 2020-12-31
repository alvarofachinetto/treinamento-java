package patterns.abstractfactory;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have create checkbox for Windows");
    }
}

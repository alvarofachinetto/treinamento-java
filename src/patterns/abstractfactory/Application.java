package patterns.abstractfactory;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}

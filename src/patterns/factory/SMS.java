package patterns.factory;

public class SMS implements ShareMessage{

    private String number;

    public SMS(String number) {
        this.number = number;
    }

    @Override
    public String showMessage(String message) {
        if(number.equals(null))
            return null;

        return "Number " + number + " message " + message;
    }

}

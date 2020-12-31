package patterns.factory;

public class Email implements ShareMessage {

    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public String showMessage(String message) {
        if(email.equals(null))
            throw new IllegalArgumentException("Message can not null!");

        return "Email " + email + " message " + message;
    }

}

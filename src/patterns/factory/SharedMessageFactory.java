package patterns.factory;

public class SharedMessageFactory {

    public ShareMessage shareMessage(String contact, String to){
        if(to.equalsIgnoreCase("Email"))
            return new Email(contact);
        else if(to.equalsIgnoreCase("SMS"))
            return new SMS(contact);

        throw  new IllegalArgumentException("Shared not works!");
    }

}

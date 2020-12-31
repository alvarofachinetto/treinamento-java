package annotation;

import java.lang.annotation.Annotation;

public class SendMessageImpl implements  SendMessage{


    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    @Override
    public String message() {
        return "Ola";
    }
}

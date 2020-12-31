package patterns.factory;

public class Main {
    public static void main(String[] args) {

        SharedMessageFactory sharedMessageFactory = new SharedMessageFactory();

        ShareMessage shareMessage = sharedMessageFactory.shareMessage("alvaro.silva@gmail.com", "Email");

        System.out.println(shareMessage.showMessage("VSF!!"));

    }
}

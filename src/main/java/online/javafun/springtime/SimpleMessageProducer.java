package online.javafun.springtime;

public class SimpleMessageProducer implements MessageProducer {
    @Override
    public String getMessage() {
          return "Example message " + System.currentTimeMillis();
    }
}

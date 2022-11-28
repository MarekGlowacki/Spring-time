package online.javafun.springtime;

public class MessagePrinter {
    private final SimpleMessageProducer messageProducer;

    public MessagePrinter(SimpleMessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    void printMesage() {
          String message = messageProducer.getMessage();
          System.out.println(message);
      }
}

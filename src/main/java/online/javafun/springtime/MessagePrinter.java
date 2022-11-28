package online.javafun.springtime;

public class MessagePrinter {
    private final MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    void printMesage() {
          String message = messageProducer.getMessage();
          System.out.println(message);
      }
}

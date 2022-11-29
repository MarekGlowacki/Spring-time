package online.javafun.springtime;

import online.javafun.springtime.producer.MessageProducer;
import org.springframework.stereotype.Service;

@Service
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

package online.javafun.springtime;

public class Main {
    public static void main(String[] args) {
        SimpleMessageProducer messageProducer = new SimpleMessageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(messageProducer);
        messagePrinter.printMesage();
    }
}

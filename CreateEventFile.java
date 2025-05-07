import java.io.*;
import java.util.Scanner;

class CreateEventFile {
    int eventNumber;
    String eventTypeCode;
    int numberOfGuests;
    double price;

    Event(int eventNumber, String eventTypeCode, int numberOfGuests, double price) {
        this.eventNumber = eventNumber;
        this.eventTypeCode = eventTypeCode;
        this.numberOfGuests = numberOfGuests;
        this.price = price;
    }
}

public class CreateEventFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("eventFile.txt");
        PrintWriter pw = new PrintWriter(fw);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Enter event number:");
            int eventNumber = scanner.nextInt();

            System.out.println("Enter event type code:");
            String eventTypeCode = scanner.next();

            System.out.println("Enter number of guests:");
            int numberOfGuests = scanner.nextInt();

            System.out.println("Enter price:");
            double price = scanner.nextDouble();

            Event event = new Event(eventNumber, eventTypeCode, numberOfGuests, price);

            pw.println(event.eventNumber);
            pw.println(event.eventTypeCode);
            pw.println(event.numberOfGuests);
            pw.println(event.price);
            pw.println();
        }

        pw.close();
        scanner.close();
    }
}

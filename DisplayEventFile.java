import java.io.*;
import java.util.Scanner;

class DisplayEventFile {
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

public class DisplayEventFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("eventFile.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            int eventNumber = Integer.parseInt(line);
            String eventTypeCode = br.readLine();
            int numberOfGuests = Integer.parseInt(br.readLine());
            double price = Double.parseDouble(br.readLine());

            Event event = new Event(eventNumber, eventTypeCode, numberOfGuests, price);

            System.out.println("Event number: " + event.eventNumber);
            System.out.println("Event type code: " + event.eventTypeCode);
            System.out.println("Number of guests: " + event.numberOfGuests);
            System.out.println("Price: " + event.price);
            System.out.println();
        }

        br.close();
        fr.close();
    }
}

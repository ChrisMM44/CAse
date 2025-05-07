import java.util.Scanner;

public class EventDemo {
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    Event [] events = new Event [3];
	    for (int i = 0; i < 3; i++) {
	        System.out.printf ("Enter event no for event %d: ", i+1);
	        String eno = sc.next ();
	        System.out.printf ("Enter guests for event %d: ", i+1);
	        int guests = sc.nextInt();
	        System.out.printf ("Enter contact phone for event %d: ", i+1);
	        sc.nextLine ();
	        String ph = sc.nextLine();
	        events [i] = new Event (eno, guests);
	        events [i].setPhone (ph);
	        System.out.println ("EventNo: " + events [i].getEventNo () + " PhoneNo: " + events [i].getPhone());
	    }
	}
}

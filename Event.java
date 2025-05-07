public class Event {
    String EventNo;
    int guests;
    String phone;
    public Event (String eno, int gno) {
        setEventNo (eno);
        guests = gno;
    }
    public void setEventNo (String eno) {
        if ((eno.length() != 4) || !Character.isLetter(eno.charAt (0)) || !Character.isDigit(eno.charAt(1))
            || !Character.isDigit(eno.charAt(2)) || !Character.isDigit(eno.charAt(3)) )
            EventNo = "A000";
        else 
            EventNo = eno.toLowerCase ();
    }
    public void setPhone (String ph) {
        phone = "";
        for (int i = 0; i < ph.length(); i++)
            if (Character.isDigit (ph.charAt (i)))
                phone += ph.charAt (i);
        if (phone.length () < 10)
            phone = "0000000000";
    }
    public String getEventNo () {
        return EventNo;
    }
    public String getPhone () {
        return "(" + phone.substring (0, 3) + ") " + phone.substring (3, 6) + "-" + phone.substring (6);
    }

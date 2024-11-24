package gr.aueb.cf.ch2;

/**
 * Επιδεικνυει τις μετατροπες μεταξυ διαφορετικων
 * τυπων δεδομενων.
 */

public class TypecastApp {

    public static void main(String[] args) {
        int myInt = 10;
        long myLong = 20;
        int myResultInt = 0;
        long myResultLong = 0L;

        myLong = myInt; //auto-widening, auto typecast
        myInt = (int) myLong; //typecast --> 2η επιλογη από κόκκινο γλόμπο!

        myResultInt = (int) (myInt + myLong);
        myResultLong = myInt * myLong;
        myResultLong = myInt;

    }
}

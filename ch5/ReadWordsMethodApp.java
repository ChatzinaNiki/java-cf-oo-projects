package gr.aueb.cf.ch5;

public class ReadWordsMethodApp {

    static boolean isHash = false;
    static char ch = ' ';

    public static void main(String[] args) throws IOException, java.io.IOException {

        do {
            consumeWord();
            System.out.println();
            consumeSpaces();
        } while (!isHash);
    }

    public static void consumeWord() throws IOException, java.io.IOException {
        while ((ch = (char) System.in.read()) != ' ') {
            if (ch == '#') {
                isHash = true;
                break;
            }
            System.out.println(ch + " ");
        }
    }

    public static void consumeSpaces() throws IOException, java.io.IOException {
        while ((ch = (char) System.in.read()) == ' ') ;
        if (ch == '#') {
            isHash = true;
        }
        if (!isHash) System.out.println(ch + " ");
    }

}
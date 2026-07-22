import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        String text = read.next().toLowerCase();
        char character = text.charAt(0);

        Alphabet alphabet = new Alphabet(character);
        char nextAlphabet = (char)alphabet.getAsciivalue();
        System.out.println(nextAlphabet);
        
        read.close();
    }
}

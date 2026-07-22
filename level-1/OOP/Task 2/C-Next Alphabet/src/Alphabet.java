public class Alphabet {
    char character;
    int asciiValue;

    public Alphabet(char character) {
        this.character = character;
    }

    public int getAsciivalue() {

        asciiValue = (int) character;
        asciiValue++;
        return asciiValue;
    }
}

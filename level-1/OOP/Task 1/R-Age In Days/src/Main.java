    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws Exception {
            Scanner read = new Scanner(System.in);

            int ageInDays = read.nextInt();

            Age age = new Age(ageInDays);

            age.printFinalResult();

            read.close();


        }
    }

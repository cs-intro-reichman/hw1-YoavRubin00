
// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]);
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        System.out.printf("Hundreds: %d, Tens: %d, Units: %d\n", hundreds, tens, units);

    }
}

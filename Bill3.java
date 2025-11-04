// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // To get you started, here is the first line in the program:
        String d1 = args[0];
        String d2 = args[1];
        String d3 = args[2];
        String bill = args[3];
        double billAmount = Double.parseDouble(bill);
        double share = billAmount / 3;
        share = Math.ceil(share);
        System.out.println(args[2] + " owes " + share);
        System.out.println(args[1] + " owes " + share);
        System.out.println(args[0] + " owes " + share);
    }
}

    


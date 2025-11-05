
// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
    public static void main(String[] args) {
    double a = Math.random() * 100;
    double b = Math.random() * 100;
    double c = Math.random() * 100;
    double Tempmin = Math.min(a, Math.min(b, c));
    double Tempmax = Math.max(a, Math.max(b, c));
    double Tempmid = a + b + c - Tempmin - Tempmax;
    System.out.printf("%f, %f, %f",Tempmin, Tempmid, Tempmax);
	}
}

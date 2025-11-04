
// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0]);
        int minutes = Integer.parseInt(args[0]);
         if (hours > 12) {
            int newhours = hours - 12;
            System.out.printf("The time is: %d:%02d PM\n", newhours, minutes);
        } else {
            System.out.printf("The time is: %d:%02d AM\n", hours, minutes);
         }
    }
}

t(
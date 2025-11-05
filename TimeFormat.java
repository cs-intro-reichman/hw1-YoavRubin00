
// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0]);
        int minutes = Integer.parseInt(args[1]);
         if (hours >= 12) {
            int newhours = hours - 12;
            if(newhours == 0){
                System.out.printf("The time is: 00:%d PM", minutes);
            }
            System.out.printf("The time is: %d:%d PM", newhours, minutes);
        } else {
            System.out.printf("The time is: %d:%d AM", hours, minutes);
         }
    }
}

t(
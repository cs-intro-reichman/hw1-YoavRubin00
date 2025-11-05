// Converts a time from 24-hour hh:mm format to 12-hour AM/PM format.
public class TimeFormat {
    public static void main(String[] args) {
        // קליטת הקלט: המטלה מצפה לקבל מחרוזת אחת (למשל, "17:08").
        String time24hr = args[0];
        // שעות הן התווים 0 ו-1. דקות הן התווים 3 ו-4.
        String hoursStr = time24hr.substring(0, 2);
        String minutesStr = time24hr.substring(3, 5);
        int hours24 = Integer.parseInt(hoursStr);
        int outputHours;
        String suffix;
        if (hours24 == 0) {
            // חצות (00:xx) הופכת ל-0:xx AM
            outputHours = 0;
            suffix = "AM";
        } else if (hours24 >= 1 && hours24 < 12) {
            // שעות הבוקר (01:00 עד 11:59) נשארות כפי שהן
            outputHours = hours24;
            suffix = "AM";
        } else if (hours24 == 12) {
            // צהריים (12:xx) נשארות כפי שהן
            outputHours = 12;
            suffix = "PM";
        } else { // hours24 > 12
            // שעות אחה"צ/ערב (13:00 עד 23:59)
            // החיסור הנדרש: 17:00 הופך ל-17 - 12 = 5 PM
            outputHours = hours24 - 12;
            suffix = "PM";
        }
        System.out.print(outputHours + ":");
        System.out.print(minutesStr); 
        System.out.println(" " + suffix);
    }
}
// Computes the future value of a saving investment.
public class FVCalc {
    public static void main(String[] args){
        double currentValue = Double.parseDouble(args[0]);
        double annualRatePercent = Double.parseDouble(args[1]);
        double numofYears = Double.parseDouble(args[2]); // Math.pow עובד עם double
        // 2. תיקון: חישוב שיעור הריבית הנכון (חלוקה ב-100)
        double rate = annualRatePercent / 100.0;
        // 3. החישוב הפיננסי
        double futureValue = currentValue * Math.pow((1 + rate), numofYears);
        System.out.printf("After %d years, $%d saved at %.1f%% will yield $%d\n", 
                     (int) numofYears, 
                     (int) currentValue, 
                     annualRatePercent, // משאירים את ה-10% כ-double כדי להדפיס 10.0%
                     (int) futureValue); // Casting ל-int כדי להדפיס 121
    }
}

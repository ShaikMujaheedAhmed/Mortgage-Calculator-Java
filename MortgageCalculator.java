import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle :");
        int principle = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Annual intereset :");
        float annualIntrest  = scanner.nextFloat();
        float monthlyIntrest = annualIntrest / PERCENT / MONTH_IN_YEAR ;

        System.out.print("Periods (Years) :");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTH_IN_YEAR ;

        double mortage = principle *( monthlyIntrest * Math.pow((1 + monthlyIntrest), numberOfPayments))/((Math.pow((1 + monthlyIntrest), numberOfPayments)) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String results = currency.format(mortage);
        System.out.print("Mortage :" + results);
    }
}
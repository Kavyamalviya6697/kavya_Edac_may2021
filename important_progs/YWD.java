import java.util.*;

public class YWD {

    public static void main(String args[])  {
    
        int year, months, day;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days : ");
        int i = s.nextInt();

        year = i / 365; // count for years 
        i = i % 365; // left days which aint got counted in year
            System.out.println("No. of years: " +year);

        months = i / 30; //above days we will convert it into weeks
        i = i % 30; // left days which aint got counted in weeks
            System.out.println("No. of months: " +months);

        day = i; // left dats got assigned to day variable
            System.out.println("No. of days: " +day);
    }
}
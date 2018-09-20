import java.util.Scanner;

public class ConvertMetersIntoFeet {
    public static void main(String[] args) {
        // Define number in meters
        Scanner input = new Scanner(System.in);

        System.out.print("Input length in meters (m): ");
        double meter = input.nextDouble();

        // Convert meters to feet using java math
        double unargumentedFeet = meter * 3.2786;

        //Convert the unargumented "feet" measurement to a 2 decimal number

        //Decimals
        double var1 = unargumentedFeet % 1;
        double var2 = var1 * 100;
        double var3 = (int)var2;
        double decimalFeet = var3 / 100;

        //PreDecimals
        double preDecimalFeet = (int)unargumentedFeet;

        //Assemble PreDecimals with Decimals
        double argumentedFeet = preDecimalFeet + decimalFeet;


        System.out.print("Conversion is complete, the length in meters is: " + argumentedFeet + "feet" );
    }
}

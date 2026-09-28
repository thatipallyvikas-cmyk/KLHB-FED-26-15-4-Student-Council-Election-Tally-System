import java.util.Scanner;

public class ParcelIntake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Parcel ID   : ");
        String id = sc.next();
        System.out.print("Recipient   : ");
        String who = sc.next();
        System.out.print("Size (S/M/L): ");
        char size = sc.next().charAt(0);
        System.out.print("Weight (kg) : ");
        double kg = sc.nextDouble();

        // storage fee = size base  +  weight surcharge  (arithmetic + casting)
        int base = (size == 'L') ? 30 : (size == 'M') ? 20 : 10;
        int surcharge = (int) Math.ceil(kg) * 2; // Rs 2 per rounded-up kg
        int fee = base + surcharge;

        System.out.println();
        System.out.println("------ INTAKE RECEIPT ------");
        System.out.printf("Parcel   : %s%n", id);
        System.out.printf("For      : %s%n", who);
        System.out.printf("Size/Wt  : %c / %.1f kg%n", size, kg);
        System.out.printf("Fee      : Rs %d.00%n", fee);
        System.out.println("---------------------------");
    }
}
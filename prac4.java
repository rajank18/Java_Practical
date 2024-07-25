import java.util.*;

public class prac4 {
    public static void main(String[] args) {
        String[] plist = {"Motor", "Fan", "Tube", "Wire", "Other"};
        int[] prate = {1000, 500, 200, 100, 300};
        double[] ptax = {8, 12, 5, 7.5, 3};

        System.out.println("23DIT024-RAJAN KANZARIYA");
        
        System.out.println("!!! Welcome to Hardware Shop !!!");
        char c;
        double tprice = 0;

        do {
            System.out.println("\n1. Motor\n2. Fan\n3. Tube\n4. Wire\n5. Other");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Enter the Units of Motor: ");
                    int n1 = scanner.nextInt();
                    for (int i = 0; i < n1; i++) {
                        double price = (ptax[0] * prate[0] / 100) + prate[0];
                        tprice += price;
                    }
                    break;

                case 2:
                    System.out.println("Enter the Units of Fan: ");
                    int n2 = scanner.nextInt();
                    for (int i = 0; i < n2; i++) {
                        double price = (ptax[1] * prate[1] / 100) + prate[1];
                        tprice += price;
                    }
                    break;

                case 3:
                    System.out.println("Enter the Units of Tube: ");
                    int n3 = scanner.nextInt();
                    for (int i = 0; i < n3; i++) {
                        double price = (ptax[2] * prate[2] / 100) + prate[2];
                        tprice += price;
                    }
                    break;

                case 4:
                    System.out.println("Enter the Units of Wire: ");
                    int n4 = scanner.nextInt();
                    for (int i = 0; i < n4; i++) {
                        double price = (ptax[3] * prate[3] / 100) + prate[3];
                        tprice += price;
                    }
                    break;

                case 5:
                    System.out.println("Enter the Units of Other: ");
                    int n5 = scanner.nextInt();
                    for (int i = 0; i < n5; i++) {
                        double price = (ptax[4] * prate[4] / 100) + prate[4];
                        tprice += price;
                    }
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

            System.out.println("Press Y to add another product or N to Exit");
            c = scanner.next().charAt(0);

        } while (c == 'Y' || c == 'y');

        System.out.println("Total Price of your Products: " + tprice);
    }
}


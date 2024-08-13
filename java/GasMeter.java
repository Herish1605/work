import java.util.Scanner;

class GasMeter {
    public double totalFuel;
    public double fuel95;
    public double fuel98;
    public double diesel;

    public GasMeter() {
        totalFuel = 0;
        fuel95 = 0;
        fuel98 = 0;
        diesel = 0;
    }

    public void refuel(String substance, double amount) {
        totalFuel += amount;

        switch (substance.toLowerCase()) {
            case "95" :
                fuel95 += amount;
                break;
            case "98" :
                fuel98 += amount;
                break;
            case "diesel" :
                diesel += amount;
                break;
        }
    }

    public static void printTotalFuel(GasMeter p4){
        System.out.println("TOTAL FUEL USED :  " + p4.totalFuel + " LITRES");
    }

    public static void printFuel95(GasMeter p4){
        System.out.println("TOTAL 95 OCTANE FUEL USED : " + p4.fuel95 + " LITRES");
    }

    public static void printFuel98(GasMeter p4) {
        System.out.println("TOTAL 98 OCTANE FUEL USED : " + p4.fuel98 + " LITRES");
    }

    public static void printDiesel(GasMeter p4) {
        System.out.println("TOTAL DIESEL FUEL USED : " + p4.diesel + " LITRES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GasMeter Gas = new GasMeter();

        while (true) {
            System.out.print("WHAT DO YOU WANT : \n 1 - FUEL 95 \n 2 - FUEL 98 \n 3 - DIESEL \n[TYPE ANY OTHER NO. TO QUIT ] \n");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice < 1 || choice > 3) {
                break;
            }

            System.out.print("ENTER AMOUNT OF REFUEL : ");
            double amount = sc.nextDouble();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Gas.refuel("95", amount);
                    break;
                case 2:
                    Gas.refuel("98", amount);
                    break;
                case 3:
                    Gas.refuel("diesel", amount); // Changed "DIESEL" to "diesel"
                    break;
            }
        }

        printTotalFuel(Gas);
        printFuel95(Gas);
        printFuel98(Gas);
        printDiesel(Gas);

        sc.close();
    }
    
}
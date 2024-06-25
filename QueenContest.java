import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Queen Contest");
        Scanner in = new Scanner(System.in);
        int taller = 2;

        System.out.println("Enter measurement unit : ");
        char m = in.next().charAt(0);

        double h1, h2;

        if (m == 'f') {
            System.out.println("No. 1 Enter height (feet part): ");
            double feet1 = in.nextDouble();
            
            double inches1 = in.nextDouble();
            h1 = feet1 * 30.48 + inches1 * 2.54;

            System.out.println("No. 2 Enter height (feet part): ");
            double feet2 = in.nextDouble();
            
            double inches2 = in.nextDouble();
            h2 = feet2 * 30.48 + inches2 * 2.54;
            
        } else {
            System.out.println("No. 1 Enter height in centimeters: ");
            h1 = in.nextDouble();

            System.out.println("No. 2 Enter height in centimeters: ");
            h2 = in.nextDouble();
        }

        if (h1 > h2) {
            taller = 1;
        }

        System.out.println("No. 1 is " + h1 + " cm and No. 2 is " + h2 + " cm");
        System.out.println(taller + " is taller");
    }
}

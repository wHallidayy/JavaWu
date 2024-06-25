import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter 3 numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        
        if ( num1 == num2 && num2 == num3) {
           System.out.println("Equal"); 
        } else {
            System.out.println("Not Equal"); 
        }
    }
}
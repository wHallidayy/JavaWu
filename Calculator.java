import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Press A: Add");
        System.out.println("Press B: Substract");
        System.out.println("Press C: Multiply");
        System.out.println("Press D: Divide");
        
        System.out.println("Press operator: ");
        char op = in.next().charAt(0);
        
        System.out.println("Press enter x: ");
        int x = in.nextInt();
        
        System.out.println("Press enter y: ");
        int y = in.nextInt();
        
        switch (op) {
            case 'A': 
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case 'S': 
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case 'M': 
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case 'D': 
                System.out.println(x + " / " + y + " = " + (x / y));
                break;
            default :
                System.out.println("try again!!");
                break;
        }
        
        System.out.println("Bye Bye !!!");
        
    }
}
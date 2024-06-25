import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n;
        
        System.out.println("Enter n: ");
        n = in.nextInt();
        
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0 ) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
}
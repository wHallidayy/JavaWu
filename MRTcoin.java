import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fee, bank20, bank50, bank100;

        System.out.println("Fee: ");
        fee = in.nextInt();

        System.out.println("Bank 100 Baht: ");
        bank100 = in.nextInt();

        System.out.println("Bank 50 Baht: ");
        bank50 = in.nextInt();

        System.out.println("Bank 20 Baht: ");
        bank20 = in.nextInt();
        
        int total = (bank100 * 100)+(bank50 * 50)+(bank20 * 20);
        
        System.out.println("Total= " + total);
        
        int change = Math.abs(total - fee);
        
        System.out.println("Change: " + change);
        
        //calculate change
        
        int coin10 = change / 10;
        System.out.println("coin 10: " + coin10);
        int rmdCoin = change % 10;
        //System.out.println("rmdCoin: " + rmdCoin);
        int coin5 = rmdCoin / 5;
        rmdCoin = rmdCoin % 5;
        System.out.println("coin 5: " + coin5);
        
        
        int coin2 = rmdCoin / 2;
        rmdCoin = rmdCoin % 2;
        System.out.println("coin 2: " + coin2);
        int coin1 = rmdCoin / 1;
        System.out.println("coin 1: " + coin1);
    }
}
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter no of sms number: ");
    int loop = in.nextInt();
    Sms[] sms = new Sms[loop];

    for (int i = 0; i < loop; i++) {
      System.out.print("Enter sms number " + (i+1) + ": " );
      String number = in.next();

      sms[i] = new Sms(number);
    }

    for (int i = 0; i < loop; i++) {
      System.out.println(i + ". " + sms[i].toString());

      sms[i].ReadAs();

      int[] smsFreq = sms[i].calFreq();
      for (int j = 0; j < smsFreq.length; j++) {
          if (smsFreq[j] > 0 ) {
              System.out.println(j + " " + "*".repeat(smsFreq[j]));
          }
      }
    }
    System.out.print("Bye Bye!!");
  }

}
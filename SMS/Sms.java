public class Sms{
  private String number;

  public Sms(String number){
    this.number = number;
  }
  
  public void ReadAs() {
    String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    for (int i = 0; i < this.number.length(); i++) {
        char ch = this.number.charAt(i);
        int digit = Character.getNumericValue(ch);
        System.out.print(words[digit] + " ");
    }

    System.out.println();
  }
  
  public int[] calFreq() {
    int[] count = new int[10];
    for (int i = 0; i < this.number.length(); i++) {
      char ch = this.number.charAt(i);
      int digit = Character.getNumericValue(ch);
      count[digit]++;
    }

    return count;
  }

  public String toString() {
    return "SMS Number : " + this.number;
  }
  
}
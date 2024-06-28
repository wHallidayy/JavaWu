import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Character: ");
        char character = in.next().charAt(0);
        
        switch (character) {
            case 'a' :
            case 'A' : 
            case 'e' :
            case 'E' : 
            case 'i' :
            case 'I' :
            case 'o' :
            case 'O' :
            case 'u' :
            case 'U' : System.out.println("vowel"); break;
            default : System.out.println("Consonant");
        }
        
    }
}
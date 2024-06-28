
class HelloWorld {
    public static void main(String[] args) {

        int c = 1;
        
        for (int i = 1; i <= 19; i++) {
            
               System.out.print(i++ + " "); 
               
               if ( c % 2 == 0) {
                   System.out.println("");
                   c = 0;
               }

               c ++;
        }
    }
}
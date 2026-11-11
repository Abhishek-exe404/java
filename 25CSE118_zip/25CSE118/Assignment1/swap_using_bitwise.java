package Assignment1;

public class swap_using_bitwise {
    public static void main(String args[]){
        int a = 50, b = 60;
         System.out.println("Before swaping : a = "+a+ " b = "+b);
         a = a^b;
         b = a^b;
         a = a^b;
          System.out.println("After swaping : a = "+a+ " b = "+b);
    }
    
}

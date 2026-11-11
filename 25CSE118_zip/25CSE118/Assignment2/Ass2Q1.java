
public class Ass2Q1 {
    public static void main(String args[]){
        int sum = 0, n = 512;

       while(n != 0){
        int digit = n % 10;
        sum = sum + digit;
        n = n / 10;
       }
        System.out.println("Sum = "+sum);
    }
}

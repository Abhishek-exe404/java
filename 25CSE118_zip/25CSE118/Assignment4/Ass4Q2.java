import java.util.Scanner;

public class Ass4Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st floating number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd floating number : ");
        double num2 = sc.nextDouble();

        if(Math.round(num1 * 1000)==Math.round(num2 * 1000)){
            System.out.println("They are the same upto 3 decimal places.");
        }
        else{
            System.out.println("They are different");
        }
        sc.close();
    }
}

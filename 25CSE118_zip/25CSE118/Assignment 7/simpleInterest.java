import java.lang.*;
import java.util.Scanner;

public class simpleInterest {
    double defaultRate = 5;
    double defaultprincipal = 10000;

    void calculateInterest(double principal, int time){
        double interest;
        interest = (principal + defaultRate * time)/100;
        System.out.println("Simple Interest = "+interest);
    }

    void calculateInterest(int time, double rate){
        double interest;
        interest = (defaultprincipal * rate * time)/100;
        System.out.println("Simple Interest : "+interest);
    }
    public static void main(String args[]){
        simpleInterest s1 = new simpleInterest();
        System.out.println("Using principal and time : ");
        s1.calculateInterest(5000.0,2);

        System.out.println("\n Using time and Rate : ");
        s1.calculateInterest(3,6.0);

    }
}

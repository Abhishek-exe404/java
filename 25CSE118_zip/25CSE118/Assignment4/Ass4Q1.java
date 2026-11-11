import java.util.Scanner;

public class Ass4Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coefficient of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter c : ");
        double c = sc.nextDouble();

        System.out.println(a+"x^2 + "+b+"x + "+c+" = 0");
        if(a==0){
            System.out.println("\nIt is not a quadratic equation.");
        }
        else{
            double D = (b*b) - (4* a * c);
            if(D>0){
                double r1 = (-b + Math.sqrt(D)) / (2*a);
                double r2 = (-b + Math.sqrt(D)) / (2*a);
                System.out.println("\nThe equation have real and distinct roots.");
                System.out.printf("1st Root = %.2f\n", r1);
                System.out.printf("2nd Root  = %.2f",r2);
            }
            else if(D==0){
                double r = -b/(2*a);
                System.out.println("\nThe equation have real and equal roots");
                System.out.printf("1st Root = 2nd Root = %.2f\n",r);
            }
            else{
                double realP = -b/(2*a);
                double imgP = Math.sqrt(-D)/(2*a);
                System.out.println("\nThe equation have complex root");
                System.out.printf("1st Root = %.2f + %.2fi\n",realP,imgP);
                System.out.printf("2nd Root = %.2f + %.2fi\n",realP,imgP);
            }
        }
        sc.close();

    }
}
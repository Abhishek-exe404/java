import java.util.Scanner;

public class Ass3Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double e,cost;
       
        System.out.print("Enter current reading : ");
        e = sc.nextDouble();
        sc.close();

        if(e <= 100){
            cost = 3 * e;
        }
        else if(e>100 && e <= 500){
            cost = (100 * 3) + (e - 100) * 4;
        }
        else{
            cost = (100 * 3) + (400 - 4) + (e - 500) * 6;
        }

        System.out.println("Total electricity cost : Rs "+cost);
}
}


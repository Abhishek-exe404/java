import java.util.Scanner;

public class Ass3Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your marks :");
        System.out.print("Maths : ");
        int Maths = sc.nextInt();

         System.out.print("Science : ");
        int Science = sc.nextInt();

         System.out.print("English : ");
        int English = sc.nextInt();

         System.out.print("SST : ");
        int SST = sc.nextInt();

         System.out.print("Hindi : ");
        int Hindi = sc.nextInt();
        sc.close();

        int total = Maths + Science + English + Hindi + SST;
        float percentage = (total * 100) / 500.0f;
        System.out.println("Total marks : "+total);
        System.out.println("Total percentage : "+percentage);
    }
}
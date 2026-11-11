import java.io.*;

public class Ass3Q2 {
    public static void main(String args[])throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader obj1 = new BufferedReader(obj);
        System.out.print("Enter the basic Salary : ");
        float basic = Float.parseFloat(obj1.readLine());
        float HRA = (basic / 100.0f) * 10;
        float DA = (basic / 100.0f) * 60;
        float gross = basic + HRA + DA;

        System.out.println("Basic Salary : "+basic);
        System.out.println("Salary of HRA : "+HRA);
        System.out.println("Salary of DA : "+DA);
        System.out.println("Gross Salary : "+gross);
    }
    
}

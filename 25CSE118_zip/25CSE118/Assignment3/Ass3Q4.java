import java.io.*;

public class Ass3Q4 {
    public static void main(String args[])throws IOException{
        BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        double num = Double.parseDouble(obj1.readLine());

        if(num < 0){
            System.out.println("Negative Number");
        }
        else if(num == 0){
            System.out.println("Zero"); 
        }
        else{
            System.out.println("Positive Number");
        }
    }
}

import java.io.*;

public class Ass3Q5 {
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the cost price : ");
        double CP = Double.parseDouble(obj.readLine());
        System.out.print("Enter the Selling Price : ");
        double SP = Double.parseDouble(obj.readLine());

        if(SP > CP){
            System.out.println("Profit");
            double profit = SP - CP;
            double p_percent = (profit / CP) * 100;
            System.out.printf("Profit : %.2f\n",profit);
            System.out.printf("Total %% of Profit : %.2f%%",p_percent);
        }
        else if(CP == SP){
            System.out.println("No profit, No Loss");
        }
        else{
            System.out.println("Loss");
            double loss = CP - SP;
            double L_percent = (loss / CP) * 100;
            System.out.printf("Loss : %.2f\n", loss);
            System.out.printf("Total %% of Loss : %.2f%%",L_percent);
        }
    }
    
}

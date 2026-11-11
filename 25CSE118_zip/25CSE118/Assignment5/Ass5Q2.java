public class Ass5Q2 {
    public static void main(String args[]){
        double e = 1.0;
        int factorial = 1;
        for(int i=2; i<=5;i++){
            factorial = factorial * i;
            e = e+(1.0/factorial);
        }
        System.out.println("Value of e = "+e);
    }
    
}

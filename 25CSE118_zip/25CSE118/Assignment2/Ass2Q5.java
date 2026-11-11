public class Ass2Q5 {
    public static void main(String args[]){
        long min = 3456789                                                                                                  ;
        long years = min / (24 * 365 * 60);
        long days = min / (60 * 24) % 365;
        System.out.println(min+ " minutes is equals to "+years+ " years and "+days+ " days.");
    }
    
}

public class Ass6Q2 {
    public static void main(String args[]){

        int sum = 0;
        int[] arr = {1,2,3,4,5};

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        int avg = sum / arr.length;
        System.out.println("The Average value of array is : "+avg);
    }
}

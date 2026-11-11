public class Ass6Q3 {
    public static void main(String args[]){
        int[] arr = {25,14,56,15,36,56,77,18,29,49};
         int max = -1;
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Maximum value for the above array = "+max);
        System.out.println("Minimum value for the above array = "+min);
    }
}

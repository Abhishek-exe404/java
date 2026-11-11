public class Ass6Q1{
    public static void main(String args[]){

        int[] arr = {100,20,30,10,50};

        for(int i=0; i<arr.length - 1; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array after sorting by  Selection sort : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
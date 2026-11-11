import java.util.Scanner;

public class Ass5Q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter an element to search : ");
        int search = sc.nextInt();
        System.out.println("ENter the elements of the array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == search){
                System.out.println("Element found at index : "+mid);
                found = true;
                break;
            }
            else if(search < arr[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}

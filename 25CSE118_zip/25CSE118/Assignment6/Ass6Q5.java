public class Ass6Q5{
  public static void main(String args[]){
	String[] arr1 = {"Python", "JAVA", "C++", "SQL"};
	String[] arr2 = {"MySQL", "SQL", "Oracle", "JAVA"};
	
	System.out.println("Common Elements :");

	for(int i=0; i<arr1.length; i++){
	  for(int j= 0; j<arr2.length; j++){
		if(arr1[i].equals(arr2[j])){
		System.out.print(arr1[i]+" ");
		break;
           }
        }
      }
    }
 } 
import java.lang.*;
import java.util.Scanner;

public class library {
    String[] books = new String[10];
    int count = 0;

    void addBook(String bookName){
        if(count < 10){
            books[count] = bookName;
            count++;
            System.out.println(bookName+" added to the library");
        }
        else{
            System.out.println("library is full");
        }
    }

    void removeBook(String bookName){
        for(int i=0; i<count; i++){
            if(books[i].equals(bookName)){
                for(int j=i; j<count-1; j++){
                    books[j] = books[j++];
                }
                count--;
                System.out.println(bookName+" removed from the library");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        library l1 = new library();
        System.out.print("Enter first book name : ");
        String book1 = sc.nextLine();
        l1.addBook(book1);
        System.out.print("Enter second book name : ");
        String book2 = sc.nextLine();
        l1.addBook(book2);
        System.out.println("Enter book name to remove : ");
        String book = sc.nextLine();
        l1.removeBook(book);
        sc.close();
    }
}

import java.lang.*;
import java.util.Scanner;

public class Student {
    String name;
    int roll_no;
    String course;

    void selectCourse(int choice){
        if(choice == 1){
            course = "java";
        }
        else if(choice == 2){
            course = "python";
        }
        else if(choice == 3){
            course = "DBMS";
        }
        else{
            course = "Invalid course";
        }
    }

    void display_details(){
        System.out.println("\nStudent Details");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+roll_no);
        System.out.println("Selected course : "+course);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter name of student : ");
        s1.name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        s1.roll_no = sc.nextInt();

        System.out.println("course options");
        System.out.println("1.java");
        System.out.println("2.python");
        System.out.println("3.DBMS");

        System.out.print("Enter your choice = ");
        int choice = sc.nextInt();
        s1.selectCourse(choice);
        s1.display_details();
        sc.close();
    }
}

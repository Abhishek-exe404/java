import java.util.Scanner;

class Employee{
    String name;
    String job;
    float salary;
    float perDaySalary;

    public void calculate(){
        perDaySalary = salary/30.0f;
    }

    public void update(int wd){
        salary = perDaySalary * wd;
    }

    public void display(){
        System.out.println("Employee Name : "+name);
        System.out.println("Job : "+job);
        System.out.println("Updated Salary : "+salary);
    }
}

public class Ass7Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.print("Enter the name of the employee : ");
        e.name = sc.nextLine();

        System.out.print("Enter the job role of the employee : ");
        e.job = sc.nextLine();

        System.out.print("Enter the salary of the employee : ");
        e.salary = sc.nextInt();

        System.out.print("Enter the total number of working days : ");
        int wd = sc.nextInt();
        if(wd <0 || wd > 31){
            System.out.println("Invalid Input.");
        }
        e.calculate();
        e.update(wd);
        e.display();
    }    
}

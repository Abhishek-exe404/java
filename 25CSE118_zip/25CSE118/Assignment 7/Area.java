import java.util.Scanner;

class Area{
    double triangleArea(double base, double height){
        return(base*height)/2;
    }

    double rectangleArea(double length, double breadth){
        return length * breadth;
    }

    static double squareArea(double side){
        return side*side;
    }
    public static void main(String args[]){
        Area a1 = new Area();
        double triangle = a1.triangleArea(10,5);
        double rectangle = a1.rectangleArea(10, 5);
        double square = squareArea(5);

        System.out.println("Area of Triangle : "+triangle);
         System.out.println("Area of Rectangle : "+rectangle);
          System.out.println("Area of square : "+square);
    }
}

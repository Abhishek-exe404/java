package Assignment1;

public class volume {
    public static void main(String args[]){
        double length = 2.0, breadth = 4.0, height = 5.0;
        double vRectangle =  length * breadth * height;
        double vCube = length * length * length;
        double aSquare = length * length;
        System.out.println("Volume of rectangle : "+vRectangle);
        System.out.println("Volume of cube : "+vCube);
        System.out.println("Area of Square : "+aSquare);
    }
    
}

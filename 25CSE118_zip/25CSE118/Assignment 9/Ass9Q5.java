class Vehicle{
    String make;
    String model;
    int year;
    String fuelType;
    Vehicle(String make, String model, int year, String fuelType){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    double calculatefuelEfficiency(){
        return 0;
    }
    double calculateDistance(){
        return 0;
    }
    double calculateMaxSpeed(){
        return 0;
    }
}

class Truck extends Vehicle{
    Truck(){
        super("Tata", "407", 2022, "Diesel");
    }
    double calculatefuelEfficiency(){
        return 8.5;
    }
    double calculateDistance(){
        return 15000;
    }
    double calculateMaxSpeed(){
        return 120;
    }
}

class Car extends Vehicle{
    Car(){
        super("Maruti", "swift", 2023, "Petrol");
    }
    double calculatefuelEfficiency(){
        return 18.0;
    }
    double calculateDistance(){
        return 8000;
    }

}

class MotorCycle extends Vehicle{
    MotorCycle(){
        super("Royal Enfield", "Classic 350", 2021, "Petrol");
    }
    double calculatefuelEfficiency(){
        return 30.0;
    }
    double calculateDistance(){
        return 5000;
    }
    double calculateMaxSpeed(){
        return 110;
    }
}

public class Ass9Q5 {
    public static void main(String[] args){
        Vehicle[] vehicle = {new Truck(), new Car(), new MotorCycle()};

        for(Vehicle v : vehicle){
            System.out.println(v.year+" "+v.make+" "+v.model+"("+v.fuelType+")");
            System.out.println("fuel Efficiency : "+v.calculatefuelEfficiency()+"Km/L");
            System.out.println("Distance : "+v.calculateDistance()+"Km");
            System.out.println("Max Speed : "+v.calculateMaxSpeed()+"Km/h");
        }
        System.out.println();
    }
    
}

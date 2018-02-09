class Car {
    String make;
    String model;
    boolean isAWD;
    int maxSeats;
    public int engineSize;
    
    Car(String mk, String mdl, boolean awd, int seats) {
        make = mk;
        model = mdl;
        isAWD = awd;
        maxSeats = seats;
    }

    public void printInfo() {
        System.out.println(make + " " + model + " " + isAWD + " " + maxSeats);
    }
}

class SUV extends Car {
    SUV(String make, String model, boolean isAWD, int maxSeats) {
        super(make, model, isAWD, maxSeats);
    }
}

public class Main {
    public static void main(String[] args) {
        SUV forester = new SUV("Subaru", "forester x", true, 5);
        forester.printInfo();
    }
}
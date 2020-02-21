class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

    //constructor overload.
    //creating multiple constructors with the same name yet different params and arguments.
    Vehicle(int p, int fc, int m) {
        this.passengers = p;
        this.fuelCap = fc;
        this.mpg = m;
    }

    Vehicle() {
        this.passengers = 0;
        this.fuelCap = 0;
        this.mpg = 0;
    }

    int range() {
        return fuelCap * mpg;
    }

    double fuelNeeded(int miles) {
        //convert the int result to double by:
        //return (double) miles / mpg;
        //or the following 
        return 1.0 * miles / mpg;
    }
}
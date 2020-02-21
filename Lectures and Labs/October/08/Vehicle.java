class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

    //vehicle constructor function
    Vehicle(int p, int fc, int m) {
        this.passengers = p;
        this.fuelCap = fc;
        this.mpg = m;
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
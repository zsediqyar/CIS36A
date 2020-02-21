class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Vehicle(5, 12, 30);
        Vehicle bmw = new Vehicle();
        bmw.passengers = 5;
        bmw.fuelCap = 18;
        bmw.mpg = 28;
    }
}
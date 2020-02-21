/*
    WHEN THE CLASSES ARE IN THE SAME DIRECTORY AS THE MAIN FILE, IT IS AUTOMATICALLY IMPORTED FOR US
*/
class VehicleDemo {
    public static void main (String args []) {
        int distance = 200;

        Vehicle car = new Vehicle();
        car.passengers = 5;
        car.fuelCap = 12;
        car.mpg = 25;
        System.out.println("Car can carry " + car.passengers + " passengers"); 
        System.out.println("Car has a range of " + car.range());
        System.out.println("To go " + distance + " miles, the car needs " + car.fuelNeeded(distance) + " gallons of fuel");


        Vehicle miniVan = new Vehicle();
        miniVan.passengers = 8;
        miniVan.fuelCap = 18;
        miniVan.mpg = 18;
        System.out.println("Mini Van can carry " + miniVan.passengers + " passengers"); 
        System.out.println("Mini Van has a range of " + miniVan.range());
        System.out.println("To go " + distance + " miles, the minivan needs " + miniVan.fuelNeeded(distance) + " gallons of fuel");

        /*
            ******** GARBAGE COLLECTION EXAMPLE BELOW ********
            When an object is created and left unused, java does Garbage collection. 
            This also affects the memory. As can be seen below, two specific memory slots 
            are reserved for both cars the car1 and car2. The car2 however is later changed 
            to point to the same location as car1, this leaves the car2 objec created as a garbage. 
        */

        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle();

        car2 = car1;

        

    }
}
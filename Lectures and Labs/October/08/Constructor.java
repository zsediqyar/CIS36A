/*
    WHEN THE CLASSES ARE IN THE SAME DIRECTORY AS THE MAIN FILE, IT IS AUTOMATICALLY IMPORTED FOR US
*/
class Constructor {
    public static void main (String args []) {
        int distance = 200;

        Vehicle car = new Vehicle(5, 12, 30);
        Vehicle miniVan = new Vehicle(8, 18, 20);

        System.out.println("Mini Van can carry " + miniVan.passengers + " passengers"); 
        System.out.println("Mini Van has a range of " + miniVan.range());
        System.out.println("To go " + distance + " miles, the minivan needs " + miniVan.fuelNeeded(distance) + " gallons of fuel");


    }
}
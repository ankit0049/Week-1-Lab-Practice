
// Create a class named VolumeOfEarth to calculate Earth's volume in km^3 and miles^3
class VolumeOfEarth {
    public static void main(String[] args) {
        // Define the radius of Earth in kilometers
        double radiusKm = 6378;

        // Calculate Earth's volume using the formula (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert the volume to cubic miles (1 mile = 1.60934 km)
        double radiusMiles = radiusKm / 1.60934;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        // Display the volume in km^3 and miles^3
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +
                           " and in cubic miles is " + volumeMiles3);
    }
}

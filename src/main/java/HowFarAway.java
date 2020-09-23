import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double startLat, endLat, startLong, endLong;

        System.out.print("Enter the latitude of the starting location: ");
        startLat = in.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        startLong = in.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        endLat = in.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        endLong = in.nextDouble();


        GeoLocation geo = new GeoLocation(startLat, startLong);
        GeoLocation geo2 = new GeoLocation(endLat, endLong);

        System.out.println("The distance is " + geo.distanceFrom(geo2) + " miles.");
    }
}
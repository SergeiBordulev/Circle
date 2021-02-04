public class Circle {
    public static void main(String[] args) {
        int circleRadius = 14;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("The Area of a circle: " + circleArea);
        System.out.println();

        double circleLength = 2 * Math.PI * circleRadius;
        System.out.println("The Length of a circle: " + circleLength);
        System.out.println();

        int circleArea2 = 615;
        double circleRadius2 = Math.sqrt(circleArea2 / Math.PI);
        System.out.println("Radius: " + circleRadius2);
        System.out.println();

        int sectorRadius = 14;
        int sectorDegree = 15;
        double sectorArea = (Math.PI * Math.pow(sectorRadius, 2) * sectorDegree) / 360;
        System.out.println("Sector area: " + sectorArea);
    }
}
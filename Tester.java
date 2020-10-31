public class Tester {
  public static void main(String[] args) {
    Point myPoint = new Point(3.0, 4.0);
    Point newPoint = new Point(0, 0);
    System.out.println(myPoint.getX());
    System.out.println(myPoint.getY());
    System.out.println(myPoint.distanceTo(newPoint)); //expecting 5.0
  }
}

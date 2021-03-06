public class Tester {
  public static void main(String[] args) {
    Point myPoint = new Point(3.0, 4.0);
    Point newPoint = new Point(0, 0);
    Point thisPoint = new Point(3.0, 4.0);
    Point trip = new Point(3, 0);
    Point heyy = new Point(-400, -50);
    Triangle myTri = new Triangle(trip, myPoint, newPoint);
    System.out.println(myPoint.getX());
    System.out.println(myPoint.getY());
    System.out.println(myPoint.distanceTo(newPoint)); //expecting 5.0
    System.out.println(myPoint.equals(newPoint)); //expecting false
    System.out.println(myPoint.equals(thisPoint)); //expecting true
    System.out.println(myTri.getPerimeter());
    System.out.println(myTri.getArea());
    System.out.println(myTri.classify()); //return scalene
    System.out.println(myTri.toString()); //
    myTri.setVertex(0, heyy);
    System.out.println(myTri.toString()); //

    }
}

public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point (x1, y1);
    v2 = new Point (x2, y2);
    v3 = new Point (x3, y3);
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea() {
    double sp = (0.5 * getPerimeter());
    return Math.sqrt(sp * (sp - v1.distanceTo(v2)) * (sp - v1.distanceTo(v2)) * (sp - v1.distanceTo(v2)));
  }

  public String classify() {
    double p1 = (Math.round(v1.distanceTo(v2) * 10000))/10000;
    double p2 = (Math.round(v2.distanceTo(v2) * 10000))/10000;
    double p3 = (Math.round(v3.distanceTo(v2) * 10000))/10000;
    if (p1 == p2 && p2 == p3 && p3 == p1) {
      return "equilateral";
    }
    else if (p1 == p2 || p1 == p3 || p2 == p3) {
      return "isosceles";
    }
    return "scalene";
  }

  public String toString() {
    return "v1(" + v1.getX() + ", " + v1.getY() + ") " + "v2(" + v2.getX() + ", " +  v2.getY() + ") " + "v3(" + v3.getX() + ", " + v3.getY() + ")";
  }









}

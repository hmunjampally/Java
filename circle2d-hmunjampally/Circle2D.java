public class Circle2D
{
    private Point2D centre;
    private double radius;
    public Circle2D()
    {
        centre = new Point2D();
        radius = 1.0;
    }

    public Circle2D(Point2D c, double r)
    {
        centre = new Point2D(c.getX(),c.getY());
        radius = r;
    }
    /*public setR(double r)
    {
        this.radius = r
    }
    public getR()
    {
        return r
    }*/
    public String toString()
    {
        String val = "Circle with radius "+radius+" centered at "+centre;
        return val;
    }
}
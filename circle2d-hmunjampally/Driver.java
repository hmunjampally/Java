public class Driver
{
    public static void main(String[] args)
    {
        Point2D c = new Point2D(1,1);
        //Point2D d = new Point2D(0,0);
        Circle2D cir0 = new Circle2D();
        Circle2D cir = new Circle2D(c,10);
        System.out.println(cir0);
        System.out.println(cir);
    }
}
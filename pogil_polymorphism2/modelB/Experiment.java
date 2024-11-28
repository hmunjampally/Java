public class Experiment{
public static void experiment(Function2D function2D)
{
System.out.println(function2D.getY(0));
}
public static void main(String []args)
{
Constant2D constant2D = new Constant2D(5);
experiment(constant2D);
}
}


/*public class Driver {
    public static void main(String []args)
    {
        double x = 5.34;
        Function2D sam = new Constant2D(x);
        System.out.println(sam.getY(x));
    }
}
*/
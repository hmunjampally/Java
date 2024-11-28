public class Constant2D implements Function2D
{
    private double value;
    public Constant2D(double value)
    {
        this.value = value;
    }

    @Override
    public double getY(double x)
    {
        return this.value;
    }
}

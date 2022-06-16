public class AbsoluteLinearFunction extends LinearFunction implements  Fun{

    public AbsoluteLinearFunction(double a, double b) {
        super(a,b);
    }

    @Override
    public double f(double x) {
        double y = Math.abs(getA()*x+getB());
        return y;
    }
}
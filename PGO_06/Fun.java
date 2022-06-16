import java.util.ArrayList;
import java.util.Collections;

public interface Fun {
    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        ArrayList<Double> results = new ArrayList<>();
        double OneResult = func.f(a);
        results.add(OneResult);
        while (a <= b) {
            a = a + alpha;
            OneResult = func.f(a);
            results.add(OneResult);
        }
        double min = Collections.min(results);
        return min;
    }
}
public class BmiService {
    public int calculate(double h, double m) {
        double f = ((h / 100) * (h / 100));
        double index = m / f;
        return (int) index;
    }
}
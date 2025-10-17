public class BmiService {
    public double calculate(double weight, double height) {
        double index = Math.round((weight / (height * height)) * 100.0) / 100.0;
        return index;
    }
}


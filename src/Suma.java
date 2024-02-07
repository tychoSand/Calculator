
public class Suma implements Operation {


    @Override
    public double calculate(double x, double y) {

        double result = 0;

        result = x + y;

        return result;
    }

    @Override
    public String operationName() {
        return "La suma de esto es: ";
    }
}

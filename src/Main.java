import java.util.Scanner ;


//Calculator Jauregui 0.1
public class Main {
    public int test = 0; //
    public static double number1 = 0;
    public static double number2 = 0;

    public static int currentOption = -1; //dsr
    public static final int optionSum = 0; //ddsr
    public static final int optionSubtract = optionSum + 1; //ddsr
    public static final int optionMultiply = optionSubtract + 1; //ddsr
    public static final int optionDivide = optionMultiply + 1; //ddsr
    public static final int optionPercentage = optionDivide + 1; //ddsr
    public static final int optionClose = optionPercentage + 1; //ddsr


    public static void main(String[] args) {

//        testingCode(); //ddsr
        scannerNumbers(); // DDSR
    }

    // sum method
//    protected static double sum(double x, double y) {
//
//        return x + y;
//    }

    // subtract method
    protected static double subtract(double x, double y) {

        return x - y;
    }

    // multiply method
    protected static double multiply(double x, double y) {

        return x * y;
    }

    // divide method
    protected static double divide(double x, double y) {

        return x / y;
    }

    // percentage method
    protected static double percentage(double x, double y) {

        return (x * y) / 100 ;// modified
    }

    protected static void scannerNumbers() { //ddsr
        Scanner scan = new Scanner(System.in);

        System.out.println("Select your option: MALU");
        System.out.println("Sum 0");
        System.out.println("Substract 1");
        System.out.println("Multiply 2");
        System.out.println("Divide 3");
        System.out.println("Percentage 4");
        System.out.println("Close 5");// Closing calculator
        //System.out.println("Exit 6");// Closing program
        currentOption = scan.nextInt();

        if (currentOption == optionClose || currentOption > optionClose) {//
            if (currentOption > optionClose){
                System.out.println("escoje las opciones indicadas");
            }
            System.out.println("Closing the calculator");
            System.exit(0);
        }

        // || OR (este o este)
        // && AND (este y este)
        // !  no se tiene que cumplir la condicion, (este no)

        System.out.println("Choose your first number: ");
        number1 = scan.nextDouble();
        System.out.println("Choose your second number: ");
        number2 = scan.nextDouble();
        double result = 0;
        String message = "";

        switch (currentOption) {
            case optionSum:
                Suma  variableSuma = new Suma();
                result = variableSuma.calculate(number1,number2);
                message = variableSuma.operationName();
                break;
            case optionSubtract:
                result = subtract(number1, number2);
                break;
            case optionMultiply:
                result = multiply(number1, number2);
                break;
            case optionDivide:
                result = divide(number1, number2);
                break;
            case optionPercentage:
                result = percentage(number1, number2);
                break;
        }


//        System.out.println("The result is: " + result);
        System.out.println(message+result);

    }

}



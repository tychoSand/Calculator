import java.util.Scanner;

//Calculator Jauregui 0.1
public class Main {
    public int test = 0 ;
    public double number1 = 0;
    public double number2 = 0;


    public static void main (String[]args) {

        testingCode(); //ddsr
    }

    // sum method
    protected double sum(double x, double y) {
        return x + y ;
    }
    // subtract method
    protected double subtract(double x, double y) {
        return x - y ;
    }
    // multiply method
    protected double multiply(double x, double y) {
        return x * y ;
    }
    // divide method
    protected double divide(double x, double y) {
        return x / y ;
    }
    // percentage method
    protected double percentage(double x, double y) {
        return x % y ;
    }
    protected void scannerNumbers () { //ddsr
        Scanner scan = new Scanner (System.in);
        System.out.println("Dame tu primer numero: ");
        number1 = scan.nextDouble();
    }

    protected static void testingCode () {
        System.out.println("My calculator") ;

        Main ivan = new Main() ;
        Main manuel = new Main() ;
        // sum
        double sumNumbers = ivan.sum(35,88) ;
        System.out.println("The result of the sum is " + sumNumbers) ;

        // subtract
        double subtractNumbers = ivan.subtract(25,18) ;
        System.out.println("The result of the subtract is " + subtractNumbers) ;

        // multiply
        double multiplyNumbers = ivan.multiply(8,18) ;
        System.out.println("The result of the multiply is " + multiplyNumbers) ;

        // divide
        double divideNumbers = ivan.divide(50,9) ;
        System.out.println("The result of the division is " + divideNumbers) ;

        // percentage
        double percentageNumbers = ivan.percentage(90,25) ;
        System.out.println("The result of the percentage is " + percentageNumbers) ;

        ivan.test = 69 ;
        manuel.test = 28 ;

        System.out.println("The value of the test on ivan " + ivan.test) ;
        System.out.println("The value of the test on manuel " + manuel.test) ;
    }
}
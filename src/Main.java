import java.util.Scanner ;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


//Calculator Jauregui 0.1
public class Main   {
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


    //Windows Variable

    protected static final boolean optionRezisableWindow = false;
    protected static final boolean optionVisibleWindow = true;

    protected static JButton [] numbersButton; //bottons from 0 to 9


    public static void main(String[] args) {

        setWindow();
//        scannerNumbers(); // DDSR

        System.out.println("Hola");
    }

    protected static void setWindow () {

        numbersButton = new JButton[10];
        JFrame ventana = new JFrame("Win Button");
        ventana.setSize(300, 200); // set size
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close config
        ventana.setLayout(null); // disabled automatic size
        ventana.setResizable(optionRezisableWindow); //disabled  resize windows by default

        // creating the button
        JButton boton = new JButton("Starting calculator...");
        boton.setBounds(100, 50, 120, 30); // set size & position of button

        // add button action
        boton.addActionListener(e -> {
//            JOptionPane.showMessageDialog(ventana, "dolping team");
            scannerNumbers();
//            ventana.setVisible(!ventana.isVisible());
        });

        // add button to windows
        ventana.add(boton);

        // make window visible
        ventana.setVisible(optionVisibleWindow);
    }

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
                result = subtract(number1, number2);
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



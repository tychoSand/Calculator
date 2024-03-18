package com.dolping;

public abstract class Subtract implements Operation {

    @Override
    public double calculate(double x, double y) {

        double result = 0 ;

        result = (x - y) ;

        return result ;
    }

    @Override
    public String operationName() {return "The subtract of this is" ; }

}

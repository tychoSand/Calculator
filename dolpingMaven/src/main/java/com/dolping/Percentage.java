package com.dolping;

public abstract class Percentage implements Operation {

    @Override//km_80
    public double calculate (double x, double y) {
        double result = 0;
        result = (x * y) / 100;
        return result;
    }
       @Override//km_80
       //
                public String operationName() {
                return "The percentage of these numbers is" ;
            }
        }


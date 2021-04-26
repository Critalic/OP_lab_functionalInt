package com.Task1;

@FunctionalInterface
interface ToCalc {
    double calculate ( double a, double b, double c, double d);
}

public class Task1 {
    private Printer printer = new Printer();
    private ToCalc calculator1 = (a,b,c,d) ->
            Math.pow(4 * Math.cosh( Math.sqrt( Math.abs(a/b) ) )+3 * Math.acos(d), c);
    private ToCalc calculator2 = (a,b,c,d) ->
            (3 * ((Math.log10(Math.abs(b/a)))) + Math.sqrt(Math.sin(c) + Math.pow(Math.E, d)));
    private ToCalc calculator3 = (a,b,c,d) ->
            (2 * Math.cos(Math.pow(a, b)) + Math.abs(Math.acos(-1 * Math.sqrt((c/d)))));

    public void calculate1(double a, double b, double c, double d) {
        double result = calculator1.calculate(a,  b,  c,  d);
        printer.print( this.getArray( a,  b,  c,  d), result);
    }

    public void calculate2(double a, double b, double c, double d) {
        double result = calculator2.calculate(a,  b,  c,  d);
        printer.print( this.getArray( a,  b,  c,  d), result);
    }

    public void calculate3(double a, double b, double c, double d) {
        double result = calculator3.calculate(a,  b,  c,  d);
        printer.print( this.getArray( a,  b,  c,  d), result);
    }

    private double[] getArray(double a, double b, double c, double d) {
        double[] array = new double[4];
            array[0] = a;
            array[1] = b;
            array[2] = c;
            array[3] = d;
            return array;
    }
}

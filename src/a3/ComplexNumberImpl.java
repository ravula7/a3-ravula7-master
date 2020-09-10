package a3;

import static java.lang.Math.sqrt;


public class ComplexNumberImpl implements ComplexNumber {

    // Fields go here.
    double A;
    double B;

    // Constructor --> create (create allows for the constructor to make this complex number for use)
    public ComplexNumberImpl(double real,double imag) {
            this.A = real;
            this.B = imag;
    }

    // Instance methods go here.
    @Override
    public double getReal(){
        return A;
    }

    @Override
    public double getImaginary(){
        return B;
    }

    @Override
    public double getAbsValue() {
        double absolute = sqrt((A*A) + (B*B));
        return absolute;

    }

    @Override
    public ComplexNumber multiply(ComplexNumber other) {

        double real = (A*other.getReal()) - (B * other.getImaginary());
        double imag = (A*other.getImaginary()) + (B * other.getReal());
        return new ComplexNumberImpl(real,imag);
    }

    @Override
    public ComplexNumber add(ComplexNumber other) {
        double real = getReal()+other.getReal();
        double imag = getImaginary()+other.getImaginary();
        return new ComplexNumberImpl(real,imag);
    }

    @Override
    public boolean equals(ComplexNumber other) {
        double real = getReal();
        double imag = getImaginary();
        return Math.abs(getReal() - other.getReal()) < EQUALS_EPSILON && Math.abs(getImaginary() - other.getImaginary()) < EQUALS_EPSILON;
    }
}









//A or .getReal?




/* MyComplex class that models a complex no with real & imaginary parts */

/**
 * MyComplex
 */
public class MyComplex {

    // Declare private instance variables
    private double real, imag;

    // Public constructors
    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Public setters & getters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return real + "+" + imag + "i";
    }

    public boolean isReal() {
        if (imag == 0)
            return true;
        else
            return false;
    }

    public boolean isImaginary() {
        if (real == 0)
            return true;
        else
            return false;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        } else
            return false;
    }

    public boolean equals(MyComplex another) {
        if (this.real == another.real && this.imag == another.imag) {
            return true;
        } else
            return false;
    }

    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex sum = new MyComplex(this.real, this.imag);
        sum.real += right.real;
        sum.imag += right.imag;
        return sum;
    }
}

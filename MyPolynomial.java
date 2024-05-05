/* Class MyPolynomial which models polynomials of degree-n */

/**
 * MyPolynomial
 */
public class MyPolynomial {

    // Declare private instance variables
    private double[] coeffs;

    // Public constructors
    // coeffs implicity declared as a double array
    public MyPolynomial(double... coeffs) { // ... --> method takes a variable number of arguments
        this.coeffs = coeffs;
    }

    // Public setters & getters
    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        double constant = coeffs[0];
        String xStr = "";
        String polyStr;
        for (int idx = coeffs.length - 1; idx > 0; idx--) {
            xStr += coeffs[idx] + "x^" + idx + " + ";
        }
        polyStr = xStr + constant;
        return polyStr;
    }

    public double evaluate(double x) {
        double sum = 0.0;
        for (int idx = 0; idx < coeffs.length; idx++) {
            if (idx == 0) {
                // Constant term
                sum += coeffs[idx];
            } else {
                // Substitute x and evaluate each term product
                sum = sum + (coeffs[idx] * Math.pow(x, idx));
            }
        }
        return sum;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxLength = Math.max(this.coeffs.length, right.coeffs.length);
        double[] polySumCoeffs = new double[maxLength];
        MyPolynomial polySum = new MyPolynomial(polySumCoeffs);

        for (int idx = 0; idx < this.coeffs.length; idx++) {
            polySumCoeffs[idx] += this.coeffs[idx];
        }

        for (int idx = 0; idx < right.coeffs.length; idx++) {
            polySumCoeffs[idx] += right.coeffs[idx];
        }
        return polySum;
    }

    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Polynomial degree: " + p1.getDegree());
        System.out.println(p2.toString());
        System.out.println("Polynomial evaluates to " + p1.evaluate(2.0));
        MyPolynomial p3 = p1.add(p2);
        System.out.println(p3.toString());
    }

}


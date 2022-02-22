package week_02;

public class DataTypesOps {
	public static void main(String[] args) {

		// int variables
       	int m = 8, n = 3;
		int isum = m + n;
        int iprod = m * n;
        int iquot = m / n;
        int irem  = m % n;

		// String concatenation is done on mixed type operands. 

		// int operations      
		System.out.println(m + " + " + n + " = " + isum);
        System.out.println(m + " * " + n + " = " + iprod);
        System.out.println(m + " / " + n + " = " + iquot);
        System.out.println(m + " % " + n + " = " + irem);
        System.out.println(m + " = " + iquot + '*' + n + '+' + irem);
		System.out.println();

        
		// double variables
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double dsum  = a + b;
        double dprod = a * b;
        double dquot = a / b;
        double drem  = a % b;
		double posInfty = 12/0.0, negInfty = -12/0.0, NaN = 0.0/0.0;
		boolean ge = a >= b;

		// double operations
		System.out.println(a + " + " + b + " = " + dsum);
        System.out.println(a + " * " + b + " = " + dprod);
        System.out.println(a + " / " + b + " = " + dquot);
        System.out.println(a + " % " + b + " = " + drem);
        System.out.println(a + " >= " + b + " = " + ge);
		System.out.println();

		// Infinity value: you can try other expressions containing Infinity
		System.out.println("posInfty = " + posInfty);
		System.out.println("Infinity sum = " + (posInfty + posInfty));
		System.out.println();

		// NaN sample value: you can try other values
		System.out.println("0xfff7000000000001L = " + Double.longBitsToDouble(0xfff7000000000001L));
		System.out.println();
        
		// Using double functions and constants available in Java
		// Math.sin(x): value of sin(x), Math.log(x): value of log(x)
		// Math.PI represents pi, Math.E is the e-number.
        System.out.println("sin(pi/2) = " + Math.sin(Math.PI/2));
        System.out.println("log(e)    = " + Math.log(Math.E));
         
    }
}

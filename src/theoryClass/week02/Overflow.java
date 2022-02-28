package theoryClass.week02;

public class Overflow {
	/*************************************************
	 * perators/Overflow.java
	 * Surprise! Java lets you overflow.
	 **************************************************/
	
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
	
}

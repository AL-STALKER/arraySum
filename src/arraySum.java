import java.util.Scanner;


public class arraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//		long l = 012;
		double D = 0;
		double m = 0;
		double q = 0;
		double t = 1.960;
		double I = 0;
	    double array[] = {10.5, 10.8, 11.2, 10.9, 10.4, 10.6, 10.9, 11.0, 10.3, 10.8, 10.6, 11.3, 10.5, 10.7, 10.8, 10.9, 10.8, 10.7, 10.9, 11.0};
	    double sum = 0;
	    
	    for(int i = 0; i < array.length; i++) {
//	    	array[i] = sc.nextInt();
	    	sum += array[i];
	    }
	    m = sum / array.length;
	    for(int i = 0; i < array.length; i++) {
	    	D += (array[i] - m) * (array[i] - m); 
	    }
	    D /= (array.length-1);
	    q = Math.sqrt(D/array.length);
	    System.out.println("Sum = "+m);
	    System.out.println("D = "+D);
	    System.out.println("q = "+q);
	    I = m - t*q;
	    System.out.print("I("+I+", ");
	    I = m + t*q;
	    System.out.println(I+")");
	}
}

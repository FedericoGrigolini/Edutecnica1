import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class tasso {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader h= new BufferedReader(input); 

		double i,n;

		System.out.print("ins.il tasso:"); i=Integer.parseInt(h.readLine().trim()); 
		i=i/100; 
		n=Math.log(2)/Math.log(1+i); 
		System.out.println(n); 
		
		
		
		*/
		Scanner input = new Scanner(System.in);
		double C,i,M=0;
		int n=0;
		
		
		System.out.print("Inserire il capitale iniziale: ");
		C = input.nextDouble();
		System.out.print("Inserire il tasso di interesse: ");
		i = input.nextDouble();
		
		for(n=1; M<=2; n++){
			M=Math.pow((1+i),n);
		}
		System.out.println("La banca restituirà il doppio del capitale iniziale in " + n + "anni. ");
		
	}
}

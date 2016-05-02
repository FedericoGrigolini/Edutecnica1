import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("inserire numero binario: ");
		String binario = input.nextLine();
		
		int decimale = dec(binario);
		
		System.out.println("Il suo valore decimale è: " + decimale);		
	}

	static int dec( String s ){
		int temp = Integer.parseInt(s.trim());
		int d=0;
		
		for(int i=0; i<s.length(); i++){
			d+= Math.pow((2*(temp%10)),i);
			temp/=10;
		}		
		return d;
	}	
}

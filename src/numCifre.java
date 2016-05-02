import java.util.Scanner;

public class numCifre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	
		int num;
		int a=0;
		
		
		System.out.println("Inserisci un numero intero");
		num = input.nextInt();
		
		while(num!=0){
			num/=10;
			System.out.println(num);
			a++;
		}
		
		System.out.println("Il numero è a " + a + " cifre!");
	}
}

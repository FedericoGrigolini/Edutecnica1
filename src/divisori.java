import java.util.Scanner;

public class divisori {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a=1;
		String div = "I divisori di ";
		
		System.out.println("Inserire un numero intero diverso da 0: ");
		int num = input.nextInt();
		
		div += + num +" sono: ";
		
		for(int i=1; i<=num/2; i++){
			if(num%i==0){
				a++;
				div+= i+", ";
			}
		}
		
		div += num+", per un totale di " + a +" divisori.\n";
		System.out.println(div);
	}
}

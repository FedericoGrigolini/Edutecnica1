import java.util.Scanner;

public class primi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean error = true;
		int a=0 ,b=0 ,c;
		
		while(error){
			System.out.print("inserisci un numero intero positivo: ");
			 a= input.nextInt();
			System.out.print("inserisci un altro numero intero positivo: ");
			 b= input.nextInt();	
			if(a>1 && b>1)
				error=false;
		}
		
		if(a > b){
			c=b;
			b=a;
			a=c;
		}
		
		c=0;
		for(int i=a; i<=b; i++){
			error=false;
			for(int j=2; j<=(i/2); j++){
				if(i%j==0){
					error=true;
					break;
				}
			}
			if(!error){
				c++;
			}
		}
		System.out.println("Tra i due numeri sono presenti " + c + " numeri primi.");
	}

}

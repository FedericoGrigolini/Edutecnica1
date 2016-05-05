import java.util.Scanner;

public class CC {
	private double saldo;
	private double movimenti[];
	private int count;
	
	public CC(double x){
		this.saldo = x;
		this.movimenti = new double[5];
		for(int i=0; i<5; i++){
			this.movimenti[i]=0;
		}
		this.count=0;		
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	private void aggiornaMovimenti(double a){
		if(this.count==4){
			for(int i=4; i>0; i--){
				this.movimenti[i]=this.movimenti[i-1];
			}
			this.movimenti[0]= a;
		}else{
			this.movimenti[this.count]=a;
			this.count++;
		}	
	}
	
	public void versamento(double a){
		this.saldo+=a;
		this.aggiornaMovimenti(+a);
	}
	
	public void prelievo(double a){
		this.saldo-=a;
		this.aggiornaMovimenti(-a);
	}
	
	public void stampaMovimenti(){
		String stp = "Gli ultimi 5 movimenti sul conto sono stati:\n";
		for(int i=5; i>0; i--){
			if(this.movimenti[i-1]<0){
				stp += "Prelievo di -"+this.movimenti[i-1]+"\n";
			}else if(this.movimenti[i-1]>0){
				stp += "Versamento di +"+this.movimenti[i-1]+"\n";
			}
		}
		System.out.println(stp);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		CC mio = new CC(2150.78);
		double x;
		
		
		x= input.nextDouble();
		mio.versamento(x);
		x= input.nextDouble();
		mio.prelievo(x);
		mio.stampaMovimenti();
		System.out.println(mio.getSaldo());
		
		
	}
}

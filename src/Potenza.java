
public class Potenza {
	private int p;
	
	public Potenza(int a){
		this.p=a;
	}
	
	public void pow(){
		int a= p*p;
		System.out.println("Il quadrato della base è:" + a);
		
	}
	
	public void cambioBase(int a){
		this.p=a;
	}
}

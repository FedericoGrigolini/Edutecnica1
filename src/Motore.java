
public class Motore {

	protected boolean acceso;
	
	public Motore(){
		this.acceso = false;
	}
	
	public void accendi(){
		if(this.acceso==true){
			System.out.println("Motore già spento.");
		}
		this.acceso=true;
	}
	
	public void spegni(){
		if(this.acceso==false){
			System.out.println("Motore già spento.");
		}
		this.acceso=false;
	}
	
	public boolean getStato(){
		return this.acceso;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

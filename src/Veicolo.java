public abstract class Veicolo {
	protected String Marca;
	protected int cyl,anno,id;
	
	public Veicolo(String m, int c, int a){
		this.Marca=m;
		this.cyl=c;
		this.anno=a;
	}	
	public void assegnaPosto(int a){
		this.id=a;
	}	
	public abstract String toString();
}

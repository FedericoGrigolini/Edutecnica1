
public class Automobile extends Veicolo{
	
	protected int porte;
	protected String alimentazione;
	
	public Automobile(String m,String al, int c, int a,int p ) {
		super(m, c, a);
		this.alimentazione=al;
		this.porte=p;
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return " Marca: "+this.Marca+"\n Cilindrata: "+this.cyl+"\n Anno: "+this.anno+"\n Porte: "+this.porte+"\n Alimentazione: "+this.alimentazione+"\n Posto:"+this.id+"\n\n";
	}
	
}

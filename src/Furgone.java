
public class Furgone extends Veicolo{
	protected int capacit�;
	
	public Furgone(String m, int c, int a, int cap) {
		super(m, c, a);
		this.capacit�=cap;
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return " Marca: "+this.Marca+"\n Cilindrata: "+this.cyl+"\n Anno: "+this.anno+"\n Capacit�: "+this.capacit�+"\n Posto:"+this.id+"\n\n";
	}

}

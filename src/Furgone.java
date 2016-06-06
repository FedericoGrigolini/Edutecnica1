
public class Furgone extends Veicolo{
	protected int capacità;
	
	public Furgone(String m, int c, int a, int cap) {
		super(m, c, a);
		this.capacità=cap;
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return " Marca: "+this.Marca+"\n Cilindrata: "+this.cyl+"\n Anno: "+this.anno+"\n Capacità: "+this.capacità+"\n Posto:"+this.id+"\n\n";
	}

}

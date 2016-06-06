
public class Moto extends Veicolo{
	
	protected int tempi;
	
	public Moto(String m, int c, int a, int t) {
		super(m, c, a);
		this.tempi=t;
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return " Marca: "+this.Marca+"\n Cilindrata: "+this.cyl+"\n Anno: "+this.anno+"\n Tempi: "+this.tempi+"\n Posto:"+this.id+"\n\n";
	}
	

	
}

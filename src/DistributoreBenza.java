
public class DistributoreBenza implements Comparable{
	
	private String Città;
	private String Proprietario;
	private int cap;
	private int ben;
	private int incasso;
	
	public DistributoreBenza(String c,String p, int cap, int ben) {
		this.Città=c;
		this.Proprietario=p;
		this.cap=cap;
		this.ben=ben;
		this.incasso = 0;
	}
	public int getCap(){
		return this.cap;
	}
	
	public int compareTo(DistributoreBenza arg) {
		if(this.getCap()==arg.getCap()){
			return 0;
		}
		if(this.getCap()<arg.getCap()){
			return -1;
		}else{
			return 1;
		}
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof DistributoreBenza){
			return this.compareTo(o);
		}
		return 0;
	}
	
}

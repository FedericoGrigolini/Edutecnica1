import java.util.Scanner;

public class Punta extends Motore {
	private int x,y,z;
	
	public Punta(){
		super();
		this.x = 0;
		this.y = 0;	
		this.z = 0;
	}
	
	public void moveTo(int a,int b){
		if(this.z==0){
			this.x+=a;
			this.y+=b;
		}else{
			System.out.println("Impossibile muoversi durante foratura");
		}
	}
	
	public void abbassaPunta(){
		if(acceso){
			if(this.z==0){
				System.out.println("Il trapano sta forando.");
				this.z = 1;
			}else{
				System.out.println("Il trapano sta già eseguento un foro.");
			}
		}else{
			System.out.println("Motore spento.");
		}
	}
	
	public void alzaPunta(){
		if(this.z==1){
			this.z=0;
		}else{
			System.out.println("Il Trapano non sta forando nulla");
		}
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getZ(){
		return this.z;
	}
	
	public static void main(String[] args) {
		int x,y;
		boolean a=true;
		Punta trapano = new Punta();
		Scanner input = new Scanner(System.in);
		
		while(a){
			System.out.printf("Quale operazione si desidera eseguire: \n"
					+ "a) accendere il motore \n"
					+ "b) spegnere il motore \n"
					+ "c) muovere il trapano\n"
					+ "d) eseguire foro\n"
					+ "e) annullare operazione\n"
					+ "f) chiudi\n"
					+ "Immettere operazione: ");
			switch(input.next()){
				case "a":{
					trapano.accendi();
					break;
				}
				case "b":{
					trapano.spegni();
					break;
				}
				case "c":{
					System.out.print("Inserire lo spostamento sull'asse x: ");
					x=input.nextInt();
					System.out.print("Inserire lo spostamento sull'asse y: ");
					y=input.nextInt();
					trapano.moveTo(x, y);
					break;
				}
				case "d":{
					trapano.abbassaPunta();
					break;
				}
				case "e":{
					trapano.alzaPunta();
					break;
				}
				case "f":{
					a=false;
					break;
				}
				default:{
					System.out.println("Dato inserito non valido.");
				}
			}
		}
	}
}

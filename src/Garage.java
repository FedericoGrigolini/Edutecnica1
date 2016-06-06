import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Garage {
	protected LinkedList<Veicolo> park;
	public Garage(){

		this.park = new LinkedList();
	}
	
	private static int findSpot(LinkedList<Veicolo> l){
		int i=0;
		if(!l.isEmpty()){
			ListIterator<Veicolo> p = l.listIterator(0);
			while(p.hasNext()){
				if(p.next().id!=(i+1)){
					return i+1;
				}
				i++;
			}
		}
		if(i<15){
			return i;
		}
		return -1;
	}
	
	public String infoOccupante(int x){
		return park.get(x).toString();
	}
	
	public void registraVeicolo(){
		Scanner s=new Scanner(System.in);
		String marca,ali;
		int cyl, anno, extra,i;
		System.out.printf("Scegliere l'operazione:\n"
				+ "1) ingresso moto\n"
				+ "2) ingresso automobile\n"
				+ "3) ingresso furgone\n"
				+ "4) esci\n");
		i=s.nextInt();
		s.hasNextLine();
		switch(i){
			case 1:{
				System.out.print("Inserire Marca: ");
				marca=s.next();
				System.out.print("Inserire Cilindrata: ");
				cyl=s.nextInt();
				s.nextLine();
				System.out.print("Inserire Anno matricola: ");
				anno=s.nextInt();
				s.nextLine();
				System.out.print("Inserire Tempi: ");
				extra=s.nextInt();
				s.nextLine();
				s.close();
				this.ingresso(new Moto(marca, cyl, anno, extra));
				break;
				
			}
			case 2:{
				System.out.print("Inserire Marca: ");
				marca=s.nextLine();
				System.out.print("Inserire Cilindrata: ");
				cyl=s.nextInt();
				s.nextLine();
				System.out.print("Inserire Anno matricola: ");
				anno=s.nextInt();
				s.nextLine();
				System.out.print("Inserire Porte: ");
				extra=s.nextInt();
				s.nextLine();
				System.out.print("Inserire Alimentazione: ");
				ali=s.nextLine();
				s.close();
				this.ingresso( new Automobile(marca, ali, cyl, anno, extra));
				break;
				
			}
			case 3:{
				System.out.print("Inserire Marca: ");
				marca=s.nextLine();
				System.out.print("Inserire Cilindrata: ");
				cyl=s.nextInt();
				s.nextLine();
				System.out.print("Inserire Anno matricola: ");
				anno=s.nextInt();
				s.nextLine();
				System.out.print("Inserire Capacità: ");
				extra=s.nextInt();
				s.nextLine();
				s.close();
				this.ingresso(new Furgone(marca, cyl, anno, extra));
				break;
			}
			case 4:
			{
				System.out.println("Operazione annullata.");
				s.close();
				break;
			}
			default:{
				System.out.println("Operazione non valida.");
				s.close();
				break;
			}
		}
		
	}
	
	
	private void ingresso(Veicolo v){
		if(park.isEmpty()){
			park.add(v);
		}
		if(park.size()<15){
			park.add(findSpot(park), v);
		}else{
			System.out.println("Parcheggio Pieno, impossibile aggiungere Veicolo");
		}
		
	}
		
	public void uscita(int index){
		if(park.get(index).id==index){
			park.remove(index);
		}else{
			ListIterator<Veicolo> p = park.listIterator(0);
			while(p.hasNext()){
				if(p.next().id==index){
					park.remove(index);
					break;
				}
			}
			System.out.println("Il posto è vuoto");
		}
		
	}
	
	public void postiOccupati(){
		String s = "Posti occupati: ";
		int a;
		if(park.isEmpty()){
			System.out.println("Parcheggio Completamente libero");
			return;
		}if(park.size()==15){
			System.out.println("Parcheggio Completamente occupato");
			return;
		}
		int j=0;
		for(int i=0;i<park.size();i++){
			if(park.get(i).id==j){
				a=j+1;
				s+=a+" ";
				j++;
			}else{
				j++;
				i--;
			}	
		}
		if(j<15){
			for(j=j;j<15;j++){
				a=j+1;
				s+=a+" ";
			}
		}
		System.out.println(s);		
	}
	
	public void svuota(){
		System.out.println("Parcheggio Svuotato");
		park.removeAll(park);
	}
	
	public static void main(String[] args) {
		Garage G = new Garage();
		Scanner input=new Scanner(System.in);

		boolean menu=true;
		while(menu){
			System.out.printf("Scegliere l'operazione:\n"
					+ "1) ingresso veicolo\n"
					+ "2) uscita veicolo\n"
					+ "3) visualizza veicolo\n"
					+ "4) svuota parcheggio\n"
					+ "5) Visualizza posti occupati\n"
					+ "6) esci\n");
				int p=input.nextInt();
				input.nextLine();
			switch(p){
			case 1:{
				G.registraVeicolo();
				break;
			}
			case 2:{
				System.out.println("Inserire quale posto si vuole liberare");
				int index = input.nextInt();
				input.nextLine();
				G.uscita(index);
				break;
			}
			case 3:{
				System.out.println("Inserire quale posto si vuole liberare");
				int index = input.nextInt();
				input.nextLine();
				G.infoOccupante(index);
				break;
			}
			case 4:{
				G.svuota();
				break;				
			}
			case 5:{
				G.postiOccupati();
				break;
			}
			case 6:{
				menu=false;
				break;
			}
			default:{
				System.out.println("Commando non valido");
			}
			}
		}	
		input.close();
	}
	
}

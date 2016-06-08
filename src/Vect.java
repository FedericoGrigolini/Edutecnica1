import java.util.Vector;
class Vect{ 
	public static void main (String args []){ 
	     Vector<String> T=new Vector<String>(2); 
	     vista(T);
	     T.addElement("uno");vista(T); 
	     T.addElement("due");vista(T); 
	     T.addElement("tre");vista(T); 
	     T.trimToSize();vista(T); 
	     T.insertElementAt("ins",1);vista(T); 
	     T.setElementAt("mod",1);vista(T); 
	     T.set(1,"mod2");vista(T); 
	     T.removeElementAt(1);vista(T); 
	}//fine main 
	static void vista(Vector<String> T){ 
	     for(int i=0;i < T.size();i++)System.out.print(T.elementAt(i)+" "); 
	     System.out.println("\nsize:"+T.size()+" capacity:"+T.capacity()); 
	}//fine metodo vista 
}//fine class Vect 
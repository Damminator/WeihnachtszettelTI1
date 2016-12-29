import java.util.ArrayList;
import java.util.Scanner;
public class Automatentester {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Transition> zustaende = new ArrayList<Transition>();
		ArrayList<String> marked = new ArrayList<String>();
		
	    int[] data= new int[3];
	     
		for(int i=0;i<3;i++){
			data[i]=sc.nextInt();
		}
		
		String [] accepted = new String[data[1]];
		for(int i=0;i<data[1];i++){
			accepted[i]=sc.next();
			marked.add(accepted[i]);   //Die akzeptierenden Zustaende werden hier schon für den
									   //spaeteren Algorithmus "markiert"
		}
		
		sc.nextLine();
		
		char[] sigma = sc.nextLine().replaceAll(" ","").toCharArray();
		
		for(int i=0;i<data[0]*data[2];i++){
			zustaende.add(new Transition(sc.next(),sc.next(),sc.next()));
			}
		sc.close();
		//Bis hier hin Einlesen der Eingabe.data speichert die erste Zeile,
		//accepted speichert die zweite Zeile (akzeptierende Zustände),sigma die dritte
		//(Alphabet). In der Liste zustaende werden alle Zustsandsuebergaenge gespeichert.
	
		
		
		
		
		
		
		
}
}

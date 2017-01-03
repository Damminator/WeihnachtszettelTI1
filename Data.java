import java.util.ArrayList;
import java.util.Scanner;
/**
 * Diese Klasse speichert die über den System.in Stream eingelesenen Daten
 * des zu testenden Automaten
 * @author Jannis
 *
 */
public class Data {
	
	int[] data = new int[3];
	char[] sigma;
	String[] accepted;
	ArrayList<Transition> uebergaenge = new ArrayList<Transition>();
	
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		this.data = data;
	}
	public char[] getSigma() {
		return sigma;
	}
	public void setSigma(char[] sigma) {
		this.sigma = sigma;
	}
	public String[] getAccepted() {
		return accepted;
	}
	public void setAccepted(String[] accepted) {
		this.accepted = accepted;
	}
	public ArrayList<Transition> getUebergaenge() {
		return uebergaenge;
	}
	public void setUebergaenge(ArrayList<Transition> uebergaenge) {
		this.uebergaenge = uebergaenge;
	}
	
	public void read(Scanner scanner){
		
		for(int i=0;i<3;i++){
			data[i]=scanner.nextInt();
			}
		
		accepted =  new String[data[1]];
		
		
		for(int i=0;i<data[1];i++){
			accepted[i]=scanner.next();
			}
		
		scanner.nextLine();
		
		sigma = scanner.nextLine().replaceAll(" ", "").toCharArray();
		
		for(int i=0;i<data[0]*data[2];i++){
			uebergaenge.add(new Transition(scanner.next(),scanner.next(),scanner.next()));
			
		}
		
		
		
		
	}
	
	
	
	
	
	
}

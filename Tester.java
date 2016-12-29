import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
	
	Scanner sc = new Scanner(System.in);
	Data data = new Data();
	
	
	
	public boolean test(){
		
		
		data.read(sc);
		ArrayList<String> marked = new ArrayList<String>();
		System.out.println("accepted: ");
		for(int i=0;i<data.getAccepted().length;i++){
			System.out.println(data.getAccepted()[i]);
		}
		System.out.println("data: ");
		for(int i=0;i<data.getData().length;i++){
			
			System.out.println(data.getData()[i]);
		}
		System.out.println("sigma: ");
		for(int i=0;i<data.getSigma().length;i++){
			
			System.out.println(data.getSigma()[i]);
		}
		System.out.println("uebergaenge: ");
		for(int i=0;i<data.getUebergaenge().size();i++){
			
			System.out.print(data.getUebergaenge().get(i).getQ());
			System.out.print(data.getUebergaenge().get(i).getSymbol());
			System.out.print(data.getUebergaenge().get(i).getP());
			System.out.print("\n");
		
		}
		
		return true;
	}
	
 
	
	
	
	
	}

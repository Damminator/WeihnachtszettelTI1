import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
	
	Scanner sc;
	Data data = new Data();
	
	public Tester(Scanner sc){
		this.sc=sc;
	}
	
	public void test2(){
		
		data.read(sc);
	
		for(int i=0;i<data.getData().length;i++){
			System.out.print(data.getData()[i]);
		}
		for(int i=0;i<data.getAccepted().length;i++){
			System.out.print(data.getAccepted()[i]);
		}
		for(int i=0;i<data.getSigma().length;i++){
			System.out.println(data.getSigma()[i]);
		}
		for(Transition temp: data.getUebergaenge()){
			System.out.println(temp.getQ());
			System.out.println(temp.getSymbol());
			System.out.println(temp.getP());
		}
	}
	
	public boolean test(){
		data.read(sc);
		
		
		
		
		ArrayList<String> marked = new ArrayList<String>();
		
		for(int i=0;i<data.getAccepted().length;i++){//initiales markieren der akzeptierenden Zustaende
			marked.add(data.getAccepted()[i]);
		}
		
		while(!(marked.contains("0"))){
			
			boolean check = false;
			
			for(Transition temp: data.getUebergaenge()){
				if(marked.contains(temp.getP())){
					if(!(marked.contains(temp.getQ()))){
						marked.add(temp.getQ());
						check = true;
						
						}
				}
			}
			
			if(check==false) break;
	    }
		
		if(marked.contains("0")){
			return true;
		}
		else return false;
	
	}
	
 
	
	
	
	
	}

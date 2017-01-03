import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Tester tester = new Tester(sc);
		
	
		
		if(tester.test()==true){
			System.out.println("verzogen");
		}
		else System.out.println("fehlerhaft");
		
		

	}

}

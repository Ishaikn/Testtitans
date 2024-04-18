import java.util.Scanner;

public class RunnerClass2 {
	
	public static void main(String[] args) {
	while(true){
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your Input");
		String Actualinfo=sc1.nextLine();
		String Expectedinfo="Lenovo";	
		if(Actualinfo.equalsIgnoreCase(Expectedinfo)) {
			System.out.println("Inputs are Matching");
		}
		else{
			try {
				throw new InputMismatchException("Inputs are Not Matching");
			}
			catch(Exception obj) {
			
			System.out.println("Exception is handled");
			}
		}sc1.hasNextLine();
	}
	}
}
	//while(true) by using this condition always condition will be true and it will lead us to do continous execution
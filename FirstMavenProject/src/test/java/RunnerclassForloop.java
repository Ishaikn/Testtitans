import java.util.Scanner;

public class RunnerclassForloop {
	public static void main(String[] args) {
		for(;;){{
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
	}

//by using for(;;) this will help us to do infinite looping condition
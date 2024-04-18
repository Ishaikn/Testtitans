
public class TryandCatchblock {
	
	public static void main(String[] args) {
		try {
			System.out.println("Try1");
			System.out.println(10/0);
			try {//this one wont execute because of first statement of Exception
			System.out.println(15/0);
			}catch(Exception e) {
				System.out.println("Exception handled11");
			}
		}catch(Exception e) {
			System.out.println("Exception handled");
			try {
				System.out.println(15/0);
				}catch(Exception e1) {
					System.out.println("Exception handled11");
				}
			finally {
				try {
				System.out.println(10/0);}
				catch(Exception rr) {
				System.out.println("Exception handled in finally");
				}
			}
		}System.out.println("End Card");
	}

}


//after try block there should be must and should catch or finally block should be there
//or if anything in between try and catch block it will be an error
//if more than one statement and if any execution is there in first statement remaining statement wont be executed and those will be skipped
//In above we have two statement with Arithmetic Exception and even we added try & catch block it wont execute because in first statement we have exception
//if we need to execute the second statement please include that second statement of Try Catch block inside the first catch block
//if any exception statement is there in Finally also next statement wont execute
//again we need to use try catch block to handle it
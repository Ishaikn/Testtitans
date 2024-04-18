
public class TryandCatchBlockExample2 {
	public static void main(String[] args) {
//		try {
			try {
			System.out.println(100/0);}
			catch(Exception ee) {
				System.out.println("First Statement");
			}
			try {
			System.out.println(200/0);
			}
			catch(Exception eew) {
				System.out.println("Second Statement handled");
			}
//		}catch(Exception ee) {
//			System.out.println("Both exception handled");
//		}
	}
}

//is we remove first try catch block it will work
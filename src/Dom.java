
public class Dom {

	public static void main(String[] args) {
		
		int x = 24;
		int y = 12;
		String op = System.console().readLine();
		switch (op) {
		case "+": System.out.println(x+y);break;
		case "-": System.out.println(x-y);break;
		case "*": System.out.println(x*y);break;
		case "/": System.out.println(x/y);break;
		default: System.out.println("neodgovarajuca operacija");
		
		}
		
	}

}

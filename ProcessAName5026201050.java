import java.util.Scanner;

public class ProcessAName5026201050{
	public static void main(String args[]){

		Scanner console = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = console.nextLine();
		int nameIndex = name.indexOf(' ');
		System.out.println(nameIndex);
		char firstName = name.charAt(0);
		String surname = name.substring(nameIndex + 1);
		System.out.println("Your name: " + surname + ", " + firstName + ".");
	}
}
	
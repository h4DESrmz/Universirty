import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Signing up\n");
		RegistrationForm rf = new RegistrationForm();
		System.out.println("Enter your Fullname: ");
		String fn = sc.nextLine();
		System.out.println("\nEnter your age: ");
		String age = sc.nextLine();
		System.out.println("\nEnter your username: ");
		String userName = sc.nextLine();
		System.out.println("\nEnter your Password: ");
		String pass = sc.nextLine();
		rf.fillRegistrationForm(fn, age, userName, pass);
		sc.close();
	}

}

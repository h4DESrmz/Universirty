import java.util.*;
public class MainMenu {
	private Accounts acc;
	private Scanner sc = new Scanner(System.in);
	private Billing bp = new Billing();
	private Loan loan = new Loan();
	public MainMenu(Accounts acc) {
		this.acc = acc;
		bp.setBillAmount("4030"); bp.setBillType("Electricity Bill");
		bp.setBillAmount("723"); bp.setBillType("Gass Bill");
		bp.setBillAmount("235"); bp.setBillType("Water Bill");
		bp.addBillPayments();
		loan.addLoan(50555,"Hamza"); loan.addLoan(65924,"Daniyal");
		loan.addLoan( 34000,"Raffay"); loan.addLoan(6000, "Rameez");
	}
	public void displayUserMainMenu() {
		System.out.println("\nselect one of these:\n1. Bill Payments\n"
		+ "\2. Clear dues\n3. View account details\n"
		+ "4.Expired loan Taker\n");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				bp.billPayment();				displayUserMainMenu();	break;
			case 2:
				bp.clearAllDues();				displayUserMainMenu();	break;
			case 3:
				acc.viewAccountDetilas();		displayUserMainMenu();	break;
			case 4:
				loan.displayLoan();				displayUserMainMenu();	break;
		}
	}
}

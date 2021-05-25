
public class RegistrationForm {
	private Accounts acc = new Accounts();
	private MainMenu mm = new MainMenu(acc);
	
	public void fillRegistrationForm(String fullName, String age, String accountNumber, String password) {
		acc.setName(fullName);
		acc.setAge(age);
		acc.setAcctNumber(accountNumber);
		acc.setPassword(password);
		acc.createAccount();
		mm.displayUserMainMenu();
	}
}

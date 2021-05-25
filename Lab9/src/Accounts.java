import java.util.ArrayList;
import java.util.List;

public class Accounts implements Bank{
	private List<String> account = new ArrayList<String>();
	private String age, fullName, accountNumber, password;
	
	public String getName() {
		return fullName;
	}
	
	public void setName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getAcctNumber() {
		return accountNumber;
	}
	
	public void setAcctNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public void createAccount() {
		account.add(getName());
		account.add(getAge());
		account.add(getAcctNumber());
		account.add(getPassword());
	}
	public void viewAccountDetilas() {
		System.out.println("\nAccount Details\n");
		String[] data = {"Name","Age","AccountNumber"};
		int i = 0;
		for(var values: data) {
			System.out.println(values+": "+account.get(i));
			i++;
		}
	}
	@Override
	public void billPayment() {}
	@Override
	public void expiredLoanTaker(Object loanArr[]) {}
}

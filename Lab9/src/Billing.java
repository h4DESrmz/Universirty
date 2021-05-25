import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Billing implements Bank{

	private List <String> billPayment = new ArrayList<String>();
	private Stack<String> billPaymentBook = new Stack<String>();
	private List<String> billPaymentType = new ArrayList<String>();
	private String billType, billAmount;
	
	private String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
		billPaymentType.add(getBillType());
	}
	private String getBillAmount(){
		return billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
		billPayment.add(getBillAmount());
	}
	public void addBillPayments() {
		while(billPayment.isEmpty() != true) {
			billPaymentBook.push(billPayment.get(0));
			billPayment.remove(0);
		}
	}
	@Override
	public void createAccount() {}
	
	public void clearAllDues(){
			if(billPaymentBook.isEmpty()) {
				System.out.println("\nDues cleared Already. \n");
			}
			else {
				System.out.println("Clearing all dues ... ");
				System.out.println("Amount\t\tStatus");
				while(billPaymentBook.isEmpty() != true) {
					System.out.println(billPaymentBook.pop()+"\t\t"+billPaymentType.get(0));
					billPaymentType.remove(0);
				}
			System.out.println("\nRemaining payment: "+billPaymentBook.size());
			}
		}
		
	@Override
	public void billPayment() {
		if(billPaymentBook.isEmpty()) {
			System.out.println("\nSince All dues are clear, There are no payments to display. \n");
		}
		else {
			System.out.println("Recent Payments:");
			System.out.println("Amount\t\tType\n");
			
			for(int i=0;i<billPaymentBook.size() ;i++) {
				System.out.println((i+1)+". "+billPaymentBook.get(i)+"\t\t"+billPaymentType.get(i)+"\n");
			}
		}	
	}
	@Override
	public void expiredLoanTaker(Object loarnArr[]) {}
}

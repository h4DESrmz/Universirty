import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Loan implements Bank{
	Queue<Integer> loanAmount = new LinkedList<Integer>();
	private List<String> loanAmountTaker = new ArrayList<String>();
	public void addLoan(int amount, String amountTaker) {
		loanAmount.add(amount);
		loanAmountTaker.add(amountTaker);
	}
	public void displayLoan() {
		Object loanArr[] = loanAmount.toArray();
		System.out.println("\nLoans\n\nLoan Taker\t\tAmount");
		for(int i=0; i<loanAmount.size(); i++) {
			System.out.println(loanAmountTaker.get(i)+"\t\t\t"+loanArr[i]);
		}
		expiredLoanTaker(loanArr);
	}
	@Override
	public void createAccount() {}
	@Override
	public void billPayment() {}
	@Override
	public void expiredLoanTaker(Object loanArr[]) {
		System.out.println("\nExpired Loan Takers\n\nLoan Taker\t\tAmount");
		int index=0;
		for(int amount: loanAmount) {
			if(amount> 40000) {
				System.out.println(loanAmountTaker.get(index)+"\t\t\t"+loanArr[index]);
				index++;
			}
		}
	}
}

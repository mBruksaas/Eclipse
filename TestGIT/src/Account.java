import java.util.Date;
import java.util.ArrayList;

/**
 * The Account class implements a class that is used to manage
 * the bank account of different individuals.
 * 
 * Using the 'Transaction' class, the program is also able
 * to print out a history of transactions to/from the account.
 * 
 * @author Martin S. Bruksaas
 */
public class Account {
	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;
	
	/**
	 * The default constructor, used mostly for testing purposes.
	 */
	public Account() {
		name = "Default name";
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		transactions = new ArrayList <Transaction>();
	}
	/**
	 * The simplest of the two constructors with parameters.
	 * This constructor uses default values for the other data fields.
	 * @param id The specific ID for the account.
	 * @param balance The balance of the account when created.
	 */
	public Account(int id, double balance) {
		name = "Default name";
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
		transactions = new ArrayList <Transaction>();
	}
	/**
	 * The most advanced of the three constructors.
	 * It is recommended to use this one to avoid unnecessary code.
	 * @param name The name of the account holder.
	 * @param id The specific ID for the account.
	 * @param balance The balance of the account when created.
	 */
	public Account(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
		transactions = new ArrayList <Transaction>();
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	
	public double getAIR() { return annualInterestRate; }
	public void setAIR(double AIR) { annualInterestRate = AIR; }
	
	public Date getDateCreated() { return dateCreated; }
	
	public double getMonthlyInterestRate() { return annualInterestRate / 12.0; }
	public double getMonthlyInterest() { return balance * this.getMonthlyInterestRate() / 100.0; }
	
	/**
	 * The withdraw method enables the user to create a negative transaction
	 * for the account. Balance is automatically updated.
	 * @param amount The amount to withdraw.
	 * @param description A description of the transacation, use "" to leave blank.
	 */
	public void withdraw(double amount, String description) {
		transactions.add(new Transaction('W', -amount, balance, description));
		balance = transactions.get(transactions.size()-1).getBalance();
	}
	/**
	 * The deposit method enables the user to create a positive transaction
	 * for the account. Balance is automatically updated.
	 * @param amount The amount to deposit.
	 * @param description A description of the transacation, use "" to leave blank.
	 */
	public void deposit(double amount, String description) {
		transactions.add(new Transaction('D', amount, balance, description));
		balance = transactions.get(transactions.size()-1).getBalance();
	}
	/**
	 * The getTransactions method returns a history of all the transactions as a string.
	 * @return String Returns the history of transactions.
	 */
	public String getTransactions() {
		String temp = "Date\t\t\t\t\tType\t\t\tAmount\t\tBalance after transaction\t\tNote\n\n";
		String type;
		
		for(Transaction current : transactions) {
			if(current.getType() == 'D') {
				type = "Deposit ";
			} else {
				type = "Withdraw";
			}
			temp += current.getDate() + "\t|\t" + type + "\t|\t$" +
					Math.sqrt(Math.pow(current.getAmount(), 2)) + "\t|\t" + "$" +
					current.getBalance() + "\t\t\t\t|\t" + current.getDescription() + "\n";
		}
		return temp;
	}
}

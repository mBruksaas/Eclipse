import java.util.Date;

/**
 * The Transaction class is used by the 'Account' class to store information
 * about the transactions on an account.
 * 
 * @author Martin S. Bruksaas
 */
public class Transaction {
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	/**
	 * The main constructor.
	 * @param type The type of transaction. Use either 'D' or 'W'.
	 * @param amount The amount to deposit/withdraw. Use negative numbers for withdraw.
	 * @param balance The balance before the transaction. Balance after gets stored.
	 * @param description A description of the transaction, use "" to leave blank.
	 */
	public Transaction(char type, double amount, double balance, String description) {
		date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance + amount; //Ny saldo på konto regnes ut automatisk
		this.description = description;
	}
	
	public Date getDate() { return date; }
	public char getType() { return type; }
	public double getAmount() { return amount; }
	public double getBalance() { return balance; }
	public String getDescription() { return description; }
	
	/*Finner det unaturlig å måtte endre saldo etter transaksjonen manuelt,
	  dette gjøres derfor av programmet*/
	/**
	 * Changes the amount of the transaction, balance (after) gets automatically updated.
	 * @param amount The amount to change to.
	 */
	public void setAmount(double amount) {
		balance -= this.amount - amount;
		this.amount = amount;
	}
	public void setType(char type) { this.type = type; }
	public void setDescription(String description) { this.description = description; }
}

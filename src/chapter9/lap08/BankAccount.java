package chapter9.lap08;

public class BankAccount {
	private String username;
	private String password;
	private double balance;

	public BankAccount(String username, String passwork, double balance) {
		this.username = username;
		if (passwork.length() < 6) {
			throw new WeakPasswordException("Mật khẩu phải có ít nhất 6 ký tự.");
		}
		this.balance = balance;
		this.password = passwork;
	}

	public void withdraw(double amount) throws NegativeBalanceException {
		if (amount > this.balance) {
			throw new NegativeBalanceException("Không đủ số dư để rút tiền");
		}
		System.out.println("Rút tiền thành công. Số dư còn lại: " + (this.balance - amount));
		this.setBalance(this.balance - amount);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

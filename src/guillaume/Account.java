package guillaume;

public abstract class Account {
	private static int nbAccount;
	private String email;
	private String password;
	private boolean isActivate;
	private int id;
	
	
	public Account(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		this.isActivate = false;
		this.id = nbAccount;
		nbAccount++;
	}


	public static int getNbAccount() {
		return nbAccount;
	}


	public static void setNbAccount(int nbAccount) {
		Account.nbAccount = nbAccount;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActivate() {
		return isActivate;
	}


	public void setActivate(boolean isActivate) {
		this.isActivate = isActivate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}

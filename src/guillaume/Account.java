package guillaume;

import java.util.Objects;

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


	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(email, other.email);
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", isActivate=");
		builder.append(isActivate);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

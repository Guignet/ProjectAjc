package guillaume;

public class Admin extends Account {

	public Admin(String email, String password) {
		super(email, password);
		this.setActivate(true);
	}
	
	public void createCategory(String nom,String description) {
		DB.addCategory(new Category(nom, description));
	}
	public void modifyCategory(Category c ,String nom,String description) {
		c.setName(nom);
		c.setDescription(description);
	}
	public void deleteCategory(Category c) {
		DB.categories.remove(c.getName());
	}
	public void activateUser(User u) {u.setActivate(true);}
	public void deactivateUser(User u) {u.setActivate(true);}
	public void activateIdea(Idea i) {i.setActivate(true);}
	public void deactivateIdea(Idea i) {i.setActivate(false);}
	public void activateNewAccount() {
		for (Account a : DB.toActivate) {
			a.setActivate(true);
			DB.clearToActivate();
		}
	}
	//TODO dismiss Report
	public <T> void dismissReport(Report<T> r) {}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nAdmin [getEmail()=");
		builder.append(getEmail());
		builder.append(", getPassword()=");
		builder.append(getPassword());
		builder.append(", getId()=");
		builder.append(getId());
		builder.append("]\n");
		return builder.toString();
	}
	
	
}

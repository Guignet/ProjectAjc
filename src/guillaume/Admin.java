package guillaume;

public class Admin extends Account {

	public Admin(String email, String password) {
		super(email, password);
		this.setActivate(true);
		// TODO Auto-generated constructor stub
	}
	
	public void createCategory(String nom,String description) {}
	public void modifyCategory(String nom,String description) {}
	public void deleteCategory(Category c) {}
	public void activateUser() {}
	public void deactivateUser() {}
	public void activateIdea() {}
	public void deactivateIdea() {}
	public <T> void dismissReport(Report<T> r) {}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Admin [getEmail()=");
		builder.append(getEmail());
		builder.append(", getPassword()=");
		builder.append(getPassword());
		builder.append(", getId()=");
		builder.append(getId());
		builder.append("]");
		return builder.toString();
	}
	
	
}

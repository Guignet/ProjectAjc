package guillaume;

import java.util.ArrayList;

public class Category {
	private String name;
	private String description;
	private ArrayList<Idea> ideas = new ArrayList<>();
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		DB.addCategory(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ArrayList<Idea> getIdeas() {
		return ideas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", ideas=");
		builder.append(ideas);
		builder.append("]");
		return builder.toString();
	}
	
	//TODO to string with Idea 
	

}

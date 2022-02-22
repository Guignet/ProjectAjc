package guillaume;

import java.util.ArrayList;

import guillaume.exception.AccountNotActivatedException;
import guillaume.exception.CannotRateException;

public class User extends Account {
	private int countIdee = 0;
	private ArrayList<Idea> ideas = new ArrayList<Idea>();
	
	public User(String email, String password) {
		super(email, password);
	}
	
	public void createIdeaPictured(String title,Category category,String description,String picture) throws AccountNotActivatedException {
		if(isActivate()) {
			countIdee++;
			Idea idea = new Idea(title,description,picture);
			ideas.add(idea);
			category.getIdeas().add(idea);
			
		}
		else throw new AccountNotActivatedException("Your account is not Activated");
	}
	
	public void createIdea(String title,Category category,String description) throws AccountNotActivatedException {
		if(isActivate()) {
			countIdee++;
			Idea idea = new Idea(title,description);
			ideas.add(idea);
			category.getIdeas().add(idea);
//			DB.categories.get(category.getName()).getIdeas().add(idea);
			DB.ideas.add(idea);
			
		}
		else throw new AccountNotActivatedException("Your account is not Activated");
	}
	
	public void comment(String text,Idea i) throws AccountNotActivatedException {
		if(isActivate()) {
			
			i.addComment(new Comment(text,this));
		}
		else throw new AccountNotActivatedException("Your account is not Activated");
	}
	
	//TODO Rat
	public void rate(Idea i,Rating r) {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nUser [getEmail()=");
		builder.append(getEmail());
		builder.append(", getPassword()=");
		builder.append(getPassword());
		builder.append(", isActivate()=");
		builder.append(isActivate());
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", countIdee=");
		builder.append(countIdee);
		builder.append(", ideas=");
		builder.append(ideas);
		builder.append("]\n");
		return builder.toString();
	}

	public ArrayList<Idea> getIdeas() {
		return ideas;
	}
	
	

}

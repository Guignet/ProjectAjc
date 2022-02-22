package guillaume;

import java.util.ArrayList;

import guillaume.exception.AccountNotActivatedException;
import guillaume.exception.CannotRateException;

public class User extends Account {
	private int countIdee = 0;
	private ArrayList<Idea> ideas = new ArrayList<Idea>();
	
	public User(String email, String password,  int id) {
		super(email, password);
	}
	
	public void createIdeaPictured(String title,Category category,String description,String picture) throws AccountNotActivatedException {
		if(isActivate()) {
			countIdee++;
			Idea idea = new Idea(title,description,picture);
			ideas.add(idea);
			
		}
		else throw new AccountNotActivatedException("Your account is not Activated");
	}
	
	public void createIdea(String title,Category category,String description) throws AccountNotActivatedException {
		if(isActivate()) {
			countIdee++;
			Idea idea = new Idea(title,description);
			ideas.add(idea);
			
		}
		else throw new AccountNotActivatedException("Your account is not Activated");
	}

}

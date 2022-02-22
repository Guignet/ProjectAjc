package guillaume;

import java.util.ArrayList;

import guillaume.exception.AccountNotActivatedException;

public class Entry {

	public static void main(String[] args) throws AccountNotActivatedException {
		DB.addAccount(new Admin("test@gmail.com","toto"));
		DB.addAccount(new User("Couicou@gmail.com","toto"));
		DB.addAccount(new User("Kikou","toto"));
		
		Admin master = ((Admin) DB.accounts.get(0));
		User u1 = ((User) DB.accounts.get(1));
		User u2 = ((User) DB.accounts.get(2));
		
		// Creating Category
		master.createCategory("Biological", "This section is for biological innovation");;
		master.createCategory("Tech", "This section is for Technological innovation");;
		master.createCategory("Biological", "This section is for biological innovation");;
		master.createCategory("Biological", "This section is for biological innovation");;
		
		// Activating Users
		master.activateUser(((User) DB.accounts.get(1)));
		master.activateUser(((User) DB.accounts.get(2)));
		
		
		
		((User) DB.accounts.get(1)).createIdea("BioPrinting",DB.categories.get("Biological") , "Imagine being able to recreate Human meber just by using a printer");
		
		((User) DB.accounts.get(2)).comment("c'est pas ouf je prefere les bras robotique", ((User) DB.accounts.get(1)).getIdeas().get(0));
		System.out.println(DB.accounts);

		master.deactivateIdea(u1.getIdeas().get(0));
		System.out.println(DB.accounts);
		
	}

}

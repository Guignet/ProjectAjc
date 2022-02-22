package guillaume;

import java.util.ArrayList;
import java.util.HashMap;

public class DB {
	public static HashMap<String,Category> categories ;
	public static ArrayList<Idea> ideas ;
	public static ArrayList<Account> accounts ;
	public static ArrayList<Account> toActivate ;
	
	
//	public static ArrayList<Report<T>> reports ;
	
	public static void addCategory(Category c) {
		if(categories == null) {
			categories = new HashMap<String,Category>();
		}
		categories.put(c.getName(),c);
		
		
	}
	public static void addIdea(Idea i) {
		if(ideas == null) {
			ideas = new ArrayList<Idea>();
		}
		ideas.add(i);
	}
	public static void addAccount(Account a) {
		if(accounts == null) {
			accounts = new ArrayList<Account>();
		}
		if(accounts.contains(a)) {
			System.out.println("Account already exist");
		}else
		accounts.add(a);
	}
	
	public static void addnewAccount(Account a) {
		if(toActivate == null) {
			toActivate = new ArrayList<Account>();
		}
		if(accounts.contains(a)) {
			System.out.println("Account already exist");
		}else
		accounts.add(a);
	}
	
	public static void clearToActivate() {
		for(int i=0;i<toActivate.size();i++) {
			toActivate.remove(0);
		}
	}
	
	//TODO Report 
//	public <T>  addReport<T>() {}

}

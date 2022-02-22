package guillaume;

import java.util.ArrayList;

public class Entry {

	public static void main(String[] args) {
		Account test = new Admin("test@gmail.com","toto");
		Account test2 = new Admin("test@gmail.com","toto");
		Account test3 = new Admin("test@gmail.com","toto");
		System.out.println(test3);
		
		ArrayList<Account> a = new ArrayList<>();
		a.add(test3);
		a.add(test3);
		a.add(test);
		a.add(test2);
		a.add(test2);
		System.out.println(a.size());
		a.remove(test2);
		a.remove(test2);
		System.out.println(a.size());
	}

}

package guillaume;

public class Rating {
	private boolean vote; //if false flop if true top

	public Rating(boolean vote) {
		super();
		this.vote = vote;
	}

	public boolean Top() {
		return vote;
	}
	public boolean Flop() {
		return !vote;
	}
	

}

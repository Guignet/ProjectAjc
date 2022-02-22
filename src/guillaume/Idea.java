package guillaume;

import java.time.LocalDate;
import java.util.ArrayList;

public class Idea {
	private String title;
	private String description;
	private LocalDate date;
	private String imgPath;
	private boolean isActivate = true;
	
	private ArrayList<Comment> comments = new ArrayList<>();
	private ArrayList<Rating> ratings = new ArrayList<>();
	
	
	
	 
	// First constructor when a User want to add an picture for his Idea
	public Idea(String title, String description, String imgPath) {
		super();
		this.title = title;
		this.description = description;
		this.date = LocalDate.now();
		this.imgPath = imgPath;
		
		DB.addIdea(this);
	}
	
	// More common use constructor
	public Idea(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		this.date = LocalDate.now();

		DB.addIdea(this);
	}
	
	public void addComment(Comment c) {
		comments.add(c);
	}
	public void addRating(Rating r) {
		ratings.add(r);
	}
	
	
	
	
	// Getters & Setters
	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getImgPath() {
		return imgPath;
	}


	public boolean isActivate() {
		return isActivate;
	}

	public void setActivate(boolean isActivate) {
		this.isActivate = isActivate;
	}
	
	
	
	//To String
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if(isActivate) {
			
			builder.append("\n Idea [title=");
			builder.append(title);
			builder.append(", description=");
			builder.append(description);
			builder.append(", date=");
			builder.append(date);
			builder.append(", imgPath=");
			builder.append(imgPath);
			builder.append(", isActivate=");
			builder.append(isActivate);
			builder.append(", comments=\n  ");
			builder.append(comments);
			builder.append("]\n");
		}
		else builder.append("This Idea is no Longer Activ");
		return builder.toString();
	}
	
	

	
	
	
	

}

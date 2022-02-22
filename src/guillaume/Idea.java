package guillaume;

import java.time.LocalDate;

public class Idea {
	private String title;
	private String description;
	private LocalDate date;
	private String imgPath;
	private boolean isActivate = true;
	
	
	
	 
	// First constructor when a User want to add an picture for his Idea
	public Idea(String title, String description, String imgPath) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
		this.imgPath = imgPath;
	}
	
	// More common use constructor
	public Idea(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		this.date = LocalDate.now();
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
		builder.append("Idea [title=");
		builder.append(title);
		builder.append(", description=");
		builder.append(description);
		builder.append(", date=");
		builder.append(date);
		builder.append(", imgPath=");
		builder.append(imgPath);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	

}

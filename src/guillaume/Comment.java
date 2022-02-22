package guillaume;

public class Comment {
	private boolean isActivate = true;
	private String content;
	private User user;
	
	public Comment(String content,User user) {
		super();
		this.content = content;
		this.user = user;
	}
	public boolean isActivate() {
		return isActivate;
	}
	public String getContent() {
		return content;
	}
	public User getUser() {
		return user;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if(isActivate) {
			builder.append("Comment [content=");
			builder.append(content);
			if(user.isActivate()) {
				builder.append(", user=");
				builder.append(user.getEmail());
				
			}
			else {
				builder.append(", user= User Deactivated");
				
			}
			builder.append("]");
			return builder.toString();
			
		}else return "Comment is not visible";
	}
	
	
	
	

}

package guillaume;

import guillaume.enums.EReason;

public class Report<T> {
	public T objectReport;
	private String comment;
	private EReason reason;
	public Report(String comment, EReason reason) {
		super();
		this.comment = comment;
		this.reason = reason;
	}
	
	public void addObjectReport(T or) {
		this.objectReport = or;
	}
}

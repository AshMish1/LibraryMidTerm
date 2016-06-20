
public  class LibraryItem {
	private String title;
	private String author;
	private status status;
	private String dueDate;
	
	public LibraryItem(String title){ //, String author, status status, String dueDate) {
		this.title = title;
	//	this.author = author;
	//	this.status = status;
	//	this.dueDate = dueDate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public status getStatus() {
		return status;
	}
	public void setStatus(status status) {
		this.status = status;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
}

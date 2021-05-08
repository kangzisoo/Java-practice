package shop;

public class BoardVO {
	String id;
	String title;
	String content;
	String writer;
	//가방에 넣을 때 사용하는 메서드 setters
	//가방에서 꺼낼 때 사용하는 메서드 getters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}

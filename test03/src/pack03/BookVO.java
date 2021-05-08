package pack03;

public class BookVO {
	// BookVO 가방 안에 변수들을 생성해서 공간을 만들어준다.
	String id;
	String title;
	String story;
	String company;
	
	//값을 넣고 뺄때는 변수 하나씩 기능을 처리
	//각 변수마다 넣고 꺼내는 기능을 메서드로 구현
	//source 메뉴에서 getters, setters 자동생성
	
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
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}

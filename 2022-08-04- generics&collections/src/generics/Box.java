package generics;

public class Box <T>{

	private T content; // the box content

//	public Box(Object content) {
//		super();
//		this.content = content;
	// }

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}

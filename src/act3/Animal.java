package act3;

public abstract class Animal {
	
	private String size;
	private String color;
	private String howlVoice;
		
	public Animal(String size, String color) {
		this.size = size;
		this.color = color;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void howl() {
		System.out.println(this.howlVoice);
	}
	
	public abstract void sleep();
}

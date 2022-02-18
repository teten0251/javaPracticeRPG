package act2;

public class Inn {
	public String name;
	public String price;
	
	public Inn(String name, String price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void stay(String traveler) {
		System.out.println(
				"ここは" + this.name + "です。\n" + 
				"ようこそ" + traveler + "様。一泊" + this.price + "円です。");
	}
}

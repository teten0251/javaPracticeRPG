package act6;

public class Character {
	private String name;
	MagicInterface[] magic;
	
	public Character(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public MagicInterface[] getMagic() {
		return magic;
	}

	public void setMagic(MagicInterface[] magic) {
		this.magic = magic;
	}
	
}

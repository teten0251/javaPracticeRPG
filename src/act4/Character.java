package act4;
import act3.GenderType;
import act3.Weapon;

public class Character {
	private String name;
	private GenderType gender;
	private Weapon weapon;
	private int hp;
	private int mp;
	private int power;
	private int defense;
	private int exp;
	private int level;
	
	public Character(String name, GenderType gender) {
		this.name = name;
		this.gender = gender;
		this.exp = 0;
		this.level = 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public GenderType getGender() {
		return this.gender;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public void addExp(int exp) {
		this.exp += exp;
		if(this.exp >= 100) {
			this.level++;
			this.exp = 0;
		}
	}
	
	public void levelUp() {
		this.level++;
	}
	
	public void getCondition() {
		if(this.hp <= 0) {
			System.out.println("返事がない、ただの屍のようだ");
		}else if(this.hp <= 10) {
			System.out.println("もうダメ・・・");
		}else if(this.hp <= 50) {
			System.out.println("もうちょっとでやばそう");
		}else{
			System.out.println("まだまだ大丈夫！");
		}
	}
}

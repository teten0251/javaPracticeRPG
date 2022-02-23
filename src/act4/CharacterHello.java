package act4;
import act3.Character;
import act3.GenderType;
import act3.Weapon;

public class CharacterHello {
	public static void main(String[] args) {
		Character person = new Character("主人公", GenderType.MALE);
		Weapon weapon = null;
		try {
			String WeaponNaem = person.getWeapon().getName();			
		} catch (NullPointerException e){
			System.out.println(person.getName() + "は武器を装備していません");
		}
	}

}

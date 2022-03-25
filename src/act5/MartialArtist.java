package act5;

import act3.Weapon;

public class MartialArtist implements Job, ForwardJob{

	@Override
	public Weapon[] getEquipWeapons() {
		Weapon[] weapons = {};
		return weapons;
	}

	@Override
	public int getAdditionalPower() {
		return 10;
	}
}

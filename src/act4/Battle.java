package act4;

public class Battle {
	private Character myCharacter;
	private Character yourCharacter;
	private BattlePattern battlePattern;
	
	public Battle(Character myCharacter, Character yourCharacter, BattlePattern battlePattern) {
		this.myCharacter = myCharacter;
		this.yourCharacter = yourCharacter;
		this.battlePattern = battlePattern;
	}
	
	public void battle() {
		int count = 0;
		
		switch(this.battlePattern) {
		case ONE:
			count = 1;
			break;
		case THREE_TIME:
			count = 3;
			break;
		case SIX_TIME:
			count = 6;
			break;
		default:
			count = 1;
			break;
		}
		
		int i = 0;
		while(i < count) {
			System.out.println(myCharacter.getName() + "は" + yourCharacter.getName() + "に攻撃した。");
			System.out.println(yourCharacter.getName() + "は" + myCharacter.getName() + "に攻撃した。");
			i++;
		}
	}
}

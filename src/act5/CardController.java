package act5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardController {
	
	List<Card> cards;
	
	public List<Card> createCard() {
		List<Card> cards = new ArrayList<>();
		cards.add(new Card(1, CardType.CLUB));
		cards.add(new Card(1, CardType.DIA));
		cards.add(new Card(1, CardType.HEART));
		cards.add(new Card(1, CardType.SPADE));
		cards.add(new Card(2, CardType.CLUB));
		cards.add(new Card(2, CardType.DIA));
		cards.add(new Card(2, CardType.HEART));
		cards.add(new Card(2, CardType.SPADE));
		cards.add(new Card(3, CardType.CLUB));
		cards.add(new Card(3, CardType.DIA));
		cards.add(new Card(3, CardType.HEART));
		cards.add(new Card(3, CardType.SPADE));
		cards.add(new Card(4, CardType.CLUB));
		cards.add(new Card(4, CardType.DIA));
		cards.add(new Card(4, CardType.HEART));
		cards.add(new Card(4, CardType.SPADE));
		cards.add(new Card(5, CardType.CLUB));
		cards.add(new Card(5, CardType.DIA));
		cards.add(new Card(5, CardType.HEART));
		cards.add(new Card(5, CardType.SPADE));
		cards.add(new Card(6, CardType.CLUB));
		cards.add(new Card(6, CardType.DIA));
		cards.add(new Card(6, CardType.HEART));
		cards.add(new Card(6, CardType.SPADE));
		cards.add(new Card(7, CardType.CLUB));
		cards.add(new Card(7, CardType.DIA));
		cards.add(new Card(7, CardType.HEART));
		cards.add(new Card(7, CardType.SPADE));
		cards.add(new Card(8, CardType.CLUB));
		cards.add(new Card(8, CardType.DIA));
		cards.add(new Card(8, CardType.HEART));
		cards.add(new Card(8, CardType.SPADE));
		cards.add(new Card(9, CardType.CLUB));
		cards.add(new Card(9, CardType.DIA));
		cards.add(new Card(9, CardType.HEART));
		cards.add(new Card(9, CardType.SPADE));
		cards.add(new Card(10, CardType.CLUB));
		cards.add(new Card(10, CardType.DIA));
		cards.add(new Card(10, CardType.HEART));
		cards.add(new Card(10, CardType.SPADE));
		cards.add(new Card(11, CardType.CLUB));
		cards.add(new Card(11, CardType.DIA));
		cards.add(new Card(11, CardType.HEART));
		cards.add(new Card(11, CardType.SPADE));
		cards.add(new Card(12, CardType.CLUB));
		cards.add(new Card(12, CardType.DIA));
		cards.add(new Card(12, CardType.HEART));
		cards.add(new Card(12, CardType.SPADE));
		cards.add(new Card(13, CardType.CLUB));
		cards.add(new Card(13, CardType.DIA));
		cards.add(new Card(13, CardType.HEART));
		cards.add(new Card(13, CardType.SPADE));
		this.cards = cards;
		return this.cards;
	}
	
	public void shuffle(int count) {
		Random random = new Random();
		int num = 0;
		for (int n = 0; n < count; n++) {
			num = random.nextInt(this.cards.size() - 1);
			this.cards.add(this.cards.get(num));
			this.cards.remove(num);	
		}
	}
	
}

package pokerBase;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck {
  private ArrayList<Card> deckCards = new ArrayList<Card>();

	/**
	 * No arguments for deck, will return shuffled deck of 52 cards
	 */
	public Deck(){
		//Create an ArrayList of Cards, add each card
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];
			for (short j = 0; j <= 12; j++) {
				eRank RankValue = eRank.values()[j];
				Card NewCard = new Card(SuitValue, RankValue, (13));
				deckCards.add(NewCard);
			}
		}
		Collections.shuffle(deckCards);
	}
	/**
	 * 
	 * @return
	 */
	public Card Draw()
	{
		return deckCards.remove(0);
	}
}

package prac.tut;

public class CardDeck {

	public String[][] card = {{"Clower", "Diamond", "Heart", "Spades"}, {"1","2","3","4","5","6","7","8","9","10","11","12","13"}};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardDeck a = new CardDeck();
		System.out.println(a.card[0][1]+ " " + a.card[1][0]);
	}

}

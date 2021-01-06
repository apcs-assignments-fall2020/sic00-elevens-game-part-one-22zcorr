/**
 * Suits: ("♠", "♥", "♦", "♣")
 */
public class Tester {

	public static void main(String[] args) {
        String[] ranks = {"A", "2", "3", "4", "5", "6","7","8","9","10","J","Q","K"};
        String[] suits = {"♠", "♥", "♦", "♣"};
        int[] values = {1, 2, 3,4,5,6,7,8,9,10,-1,-1,-1};
        Deck d1 = new Deck(ranks, suits, values);
        System.out.println(d1);
	}
}

package linkedLists;
import java.util.ArrayList;
import java.util.Scanner;

public class War {
	
	private class Card {
		public int num;
		public String suit;
		
		public Card(int n, String s) {
			num = n; suit = s;
		}
		
		public String toString() {
			return num + " of " + suit;
		}
	}
	
	public War() {
		LinkedList<Card> p1 = new LinkedList<Card>(), 
				p2 = new LinkedList<Card>();
		
		deal(p1, p2);
	}
	
	public void deal(LinkedList<Card> p1, LinkedList<Card> p2) {
		// build the deck
		String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
		for (int i = 1; i <= 13; i++) {
			for (String s : suits) {
				p1.add(new Card(i, s));
			}
		}
		
		// simple shuffle the deck 100 times
		for (int i = 0; i < 100; i++) {
			p1.add(p1.remove((int)(Math.random()*52)));
		}
		
		// deal to 2 players
		for (int i = 0; i < 26; i++) {
			p2.add(p1.remove((int)(Math.random()*p1.size())));
		}
		
		play(p1, p2);
	}
	
	public void play(LinkedList<Card> p1, LinkedList<Card> p2) {
		Scanner in = new Scanner(System.in);
		while (p1.size() != 0 && p2.size() != 0) {
			
			// display current state of the game, then wait for 
			// an enter press
			System.out.println("Player 1 has "+p1.size() +" cards. Player 2 has "+p2.size()+" cards.\n");
			System.out.println("Press enter to deal cards.");
			while (in.nextLine() == null) {}

			// lists to store which cards each player has drawn
			ArrayList<Card> playedCards1 = new ArrayList<Card>();
			ArrayList<Card> playedCards2 = new ArrayList<Card>();
			
			// draw the top card from each deck
			playedCards2.add(0, p2.remove(0));
			playedCards1.add(0, p1.remove(0));
			System.out.println("Player 1 plays the "+playedCards1.get(0));
			System.out.println("Player 2 plays the "+playedCards2.get(0));
			
			// check if there's a war, repeat until different cards are played
			while (playedCards1.get(0).num == playedCards2.get(0).num) {
				System.out.println("War!");
				
				// draw the top 4 cards
				for (int i = 0; i < 4 && p1.size() > 0 && p2.size() > 0; i++) {
					playedCards1.add(0, p1.remove(0));
					playedCards2.add(0, p2.remove(0));
				}
				
				// display the 4th card
				System.out.println("Player 1 plays the "+playedCards1.get(0));
				System.out.println("Player 2 plays the "+playedCards2.get(0));
			}
			
			// if p1 wins, they get the drawn cards
			if (playedCards1.get(0).num > playedCards2.get(0).num) {
				System.out.println("Player 1 wins the round!\n");
				for (Card card : playedCards1)
					p1.add(card);
				for (Card card : playedCards2)
					p1.add(card);
			}
			
			// if p2 wins, they get the drawn cards
			else if (playedCards1.get(0).num < playedCards2.get(0).num) {
				System.out.println("Player 2 wins the round!\n");
				for (Card card : playedCards1)
					p2.add(card);
				for (Card card : playedCards2)
					p2.add(card);
			}
		}
	}
	
	public static void main(String[] args) {
		new War();
	}
}

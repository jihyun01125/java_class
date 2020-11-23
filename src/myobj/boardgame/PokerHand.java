package myobj.boardgame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import myobj.boardgame.card.Rank;

public class PokerHand {
	
	private static boolean DEBUG = true;
	
	List<PokerCard> hands;	
	boolean[] hand_opens;
	
	public PokerHand() {		
		hands = new ArrayList<>(5);
		
		if (DEBUG)
			hand_opens = new boolean[] { true, true, true, true, true };
		else
			hand_opens = new boolean[] { false, false, false, false, false };
	}
	
	public void add(PokerCard card) {
		hands.add(card);
	}
	
	public void open(int index) {
		hand_opens[index] = !hand_opens[index]; 
	}
	
	public Set<Rank> getRankSet() {
		Set<Rank> ranks = new HashSet<>();
		
		for (PokerCard hand : hands) {
			ranks.add(hand.getRank());
		}		
		return ranks;
	}
	
	public void show() {
		for (int i = 0; i < 5; ++i) {			
			if (hands.get(i) == null) {
				System.out.printf("%d : NOT YET\n", i);
			} else if (hand_opens[i]) {
				System.out.printf("%d : %s\n", i, hands.get(i));
			} else {
				System.out.printf("%d : NOT OPENED\n", i);
			}
		}
	}
	
	// PokerHand Ŭ������ �����غ�����	
	// 1. �ټ����� PokerCard�� ������ �־�� ��	
	// 2. �ټ����� PokerCard�� ����/���̸� ���� ������ �ϼ��ؾ� ��	
	// 3. �ٸ� PokerHand �ν��Ͻ��� ������ ���� ũ��񱳰� �����ؾ� ��	
	// 4. �ټ��� �� ���ϴ� ī�常 �����ϴ� ����� �־�� ��	
	// 5. ī�带 ���徿 �߰��ϴ� ����� �־�� �� 
	public static void main(String[] args) {
		int round = 0;
		Scanner test_sc = new Scanner(System.in);
		
		while (true) {			
			System.out.println("- - Round " + ++round + " - -");
			PokerDeck deck = new PokerDeck();
			
			PokerHand player01 = new PokerHand();
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());			
			
			PokerHand player02 = new PokerHand();
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			
			System.out.println("Player01's hand");
			// player01.open(0);
			player01.show();
			
			System.out.println("Player02's hand");
			player02.show();
			
			System.out.println("Checking Player01's hand");
			PokerHandRanking.check(player01);
			
			System.out.println("Checking Player02's hand");
			PokerHandRanking.check(player02);
			
			System.out.println("Press Enter to next test..");
			test_sc.nextLine();
		}
		
	}
}










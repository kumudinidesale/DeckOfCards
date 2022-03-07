package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {
	/*
	 * @purpose: Ability to check Cards and sure we have unique cards.
	 * 
	 * 
	 * 
	 * @return: ranks to further compare.
	 */

	public static ArrayList<String> deckCards = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);

	public void wellCome() {
		System.out.println("Welcome to the Deck of Cards DashBoard");
	}
           /* Display Deck of Cards 
	    *
	    */
	public void deckOfCard() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfCards = suits.length * ranks.length;
		System.out.println("Number of cards in the deck:" + numOfCards);
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deckCards.add(ranks[i] + "->" + suits[j]);
			}
		}
		toDisplay(deckCards);
	}

	public static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}
         // Calling wellCome and deckOfCard method  
	public static void main(String[] args) {
		DeckOfCards deckOfCardsGame = new DeckOfCards();
		deckOfCardsGame.wellCome();
		deckOfCardsGame.deckOfCard();

	}
}

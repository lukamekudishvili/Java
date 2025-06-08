package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArray= new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(cardArray,aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray));
        System.out.println("<----------------------------------->");

        List<Card> cards= new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);


    }
}

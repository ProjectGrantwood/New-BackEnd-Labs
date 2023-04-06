package week05.Week05OOP;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Deck {
    public List<Card> cards = new ArrayList<Card>();
    Deck(){
        this.initialize();
    }
    public void initialize(){
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        for (String suit: suits) {
            for (int i = 1; i < 14; i++){
                Card card = new Card();
                card.setNameAndValue(i + 1);
                card.setSuit(suit);
                this.cards.add(card);
            }
        }
        for (int i = 0; i < 2; i++){
            Card card = new Card();
            card.setNameAndValue(0);
            card.setSuit("Joker");
            this.cards.add(card);
        }
        this.shuffle(52);
    }
    
    public void describe(){
        Iterator<Card> deckIterator = this.cards.iterator();
        deckIterator.forEachRemaining(card -> card.describe());
    }
    
    public void main(String[] args) {
        this.initialize();
    }
    
    public void shuffle(){
        Random r = new Random();
        List<Card> temp = new ArrayList<Card>();
        
        while (temp.size() < 52){
            int cardIndex = r.nextInt(this.cards.size());
            temp.add(this.cards.get(cardIndex));
            this.cards.remove(cardIndex);
        }
        
        Iterator<Card> deckIterator = this.cards.iterator();
        deckIterator.forEachRemaining(card -> temp.add(card));
        this.cards = temp;
        
    }
    
    public Card draw(){
        Iterator<Card> drawIterator = this.cards.iterator();
        if (drawIterator.hasNext()){
            return drawIterator.next();
        } else {
            this.shuffle();
            drawIterator = this.cards.iterator();
            return drawIterator.next();
        }
    }
    
}

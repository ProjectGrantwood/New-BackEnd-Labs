package week05.Week05OOP;

import java.lang.StringBuilder;

public class Card {
    
    public String name;
    public String suit;
    public int value;
    
    
    public void describe(){
        if (this.name == "Joker") {
            System.out.println("Joker");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(this.getName());
            sb.append(" of ");
            sb.append(this.getSuit());
            sb.append(".");
            System.out.println(sb.toString());
        }
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSuit(String suit){
        this.suit = suit;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getSuit(){
        return this.suit;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setNameAndValue(int val){
        this.setValue(val);
        switch(val){
            case 0:
                this.setName("Joker");
                break;
            case 2:
                this.setName("Two");
                break;
            case 3:
                this.setName("Three");
                break;
            case 4:
                this.setName("Four");
                break;
            case 5:
                this.setName("Five");
                break;
            case 6:
                this.setName("Six");
                break;
            case 7:
                this.setName("Seven");
                break;
            case 8:
                this.setName("Eight");
                break;
            case 9: 
                this.setName("Nine");
                break;
            case 10:
                this.setName("Ten");
                break;
            case 11:
                this.setName("Jack");
                break;
            case 12: 
                this.setName("Queen");
                break;
            case 13: 
                this.setName("King");
                break;
            case 14: 
                this.setName("Ace");
                break;
        }
    }
}


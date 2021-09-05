package week3.CardCompany;

import week3.Company.Company;

public class CardCompany {
    private static CardCompany one;
    private CardCompany(){
    }
    public Card createCard(){
        Card card=new Card();
        return card;
    }
    public static CardCompany getInstance(){
        if (one == null){
            one = new CardCompany();
        }
        return one;
    }
}

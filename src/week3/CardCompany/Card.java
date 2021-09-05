package week3.CardCompany;

public class Card {
    static int card_num=10000;
    int this_card;
    Card()
    {
        this.card_num++;
        this_card = card_num;
    }
    public int getCardNumber()
    {
        return this_card;
    }

}

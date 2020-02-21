import java.util.*;
class CardTester {
    public static void main(String args []) {

        Card card   = new Card(4, 'D');
        int rank1   = card.getRank();
        char suit1  = card.getSuit();
        card        = new Card(4, 'S');
        int rank2   = card.getRank();
        char suit2  = card.getSuit();

        System.out.println("Rank 1: " + rank1 + "\t Suit 1: " + suit1);
        System.out.println("Rank 2: " + rank2 + "\t Suit 2: " + suit2);

    }
}
class Card {
    int rank;
    char suit;

    Card(int rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    int getRank() {
        return rank;
    }
    char getSuit() {
        return suit;
    }
}
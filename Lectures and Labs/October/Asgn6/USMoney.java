class USMoney {
    int dollars;
    int cents;

    USMoney(int d, int c) {
        dollars = d + c / 100;
        cents = c % 100;
    }
    void addUp(USMoney m) {
        int c = this.cents + m.cents;
        int d = this.dollars + m.dollars;
        this.dollars = d + c / 100;
        this.cents = c % 100;
    }
    USMoney plus(USMoney m) {
        return new USMoney (this.dollars + m.dollars, this.cents + m.cents);
    }
}
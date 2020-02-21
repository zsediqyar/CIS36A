class Die {
    int sideUp;

    void roll() {
        sideUp = (int) (Math.random() * 6) + 1;
    }

    int getSideUp() {
        return sideUp;
    }
}
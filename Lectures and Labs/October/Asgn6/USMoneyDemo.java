class USMoneyDemo {
    public static void main(String[] args) {
        USMoney x = new USMoney(5, 50);
        USMoney y = new USMoney(10, 90);

        System.out.println(x.dollars + "." + x.cents);

        x.addUp(y);

        System.out.println(x.dollars + "." + x.cents);
    }
}
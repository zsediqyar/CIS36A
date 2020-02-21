class Calc {
    int powerN(int n) {
        return (int) Math.pow(2, n);
    }

    int powerN(int a, int n) {
        return (int) Math.pow(a, n);
    }

    //method on variable arguments or VARARGS
    int vaSum(int ... data) {
        int sum = 0;
        for(int v: data) {
            sum += v;
        }
        return sum;
    }

}
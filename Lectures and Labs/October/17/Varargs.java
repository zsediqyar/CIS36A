class VarargsMethod {
    //method on variable arguments or VARARGS
    int vaSum(int ... data) {
        int sum = 0;
        for(int v: data) {
            sum += v;
        }
        return sum;
    }
    //method to sum an array
    int sumArr(int data[]) {
        int sum = 0;
        for(int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
}

class Varargs {
    public static void main(String [] args) {
        VarargsMethod sum = new VarargsMethod();
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("The sum: " + sum.vaSum(1,2,3,4,5));
        System.out.println("The array sum: " + sum.sumArr(arr));
    }
}
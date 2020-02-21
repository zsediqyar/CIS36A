/*
An assignment operator in arrays do not work like variables. for example setting one array equal to another does not copy the elements
but it only points to the same location in memory of the first array. Meaning if one array is changed the other will automatically be affected.

ONE OF THE WAYS TO COPY IS TO RUN A FOR LOOP AND PUSH THE ELEMENTS ONE BY ONE TO ANOTHER ARRAY. 

INT NUM1 [];
INT NUM2 [];
FOR(INT I = 0; I < ARRAYSIZE; I++) {
    NUM2[I] = NUM1[I];
}
*/
class ArrayRefs {
    public static void main(String[] args) {
        int nums1 [] = {1, 2, 3, 4, 5};
        int nums2 [] = {6, 7, 8, 9, 10};

        for(int a: nums1) System.out.print(a + " ");
        for(int a: nums2) System.out.print(a + " ");
        System.out.println("");
        for(int i = 0; i < 5; i++) {
          System.out.println(nums1[i] + " " + nums2[i]);
        }
        nums2 = nums1;

        for(int t: nums2) System.out.print(t + " " );
        System.out.println("");
        nums2[3] = 99;
        for(int t: nums1) System.out.print(t + " " );

    }
}
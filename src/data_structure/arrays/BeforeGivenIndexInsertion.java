package data_structure.arrays;

public class BeforeGivenIndexInsertion {
    public static void main(String[] args) {
        int number = 5, index=3, value=10;
        int[] A = new int[number+1];

        for(int i=0; i<number; i++) {
            A[i] = i+1;
        }

        System.out.println("Your array: ");
        for(int i=0; i<number; i++) {
            System.out.println(i + " => " + A[i]);
        }

        for(int i= number-1; i>=index-2; i--) {
            A[i+1] = A[i];
        }
        A[index-2] = value;

        System.out.println("After Inserting: ");
        for(int i=0; i<=number; i++) {
            System.out.println(i + " => " + A[i]);
        }
    }
}

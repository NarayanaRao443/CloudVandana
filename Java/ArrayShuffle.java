import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int ar[]= {1,2,3,4,5,6,7};
        int temp;
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        Random ran = new Random();
        for (int i = 0; i < ar.length; i++) {
            int j = ran.nextInt(i+1);
            
            temp = ar[j];
            ar[j] = ar[i];
            ar[i] = temp;
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}

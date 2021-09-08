package sorting;

public class Insertionsort {
    public static void main(String[] args) {
        int[] a = {12, 11, 13, 5, 6};
        insertionsort(a);
    }
/*
what we do is we take a hole where one element is to be selected and then we keep on going the left side
and we go until we have found correct place
the thing we need to know is we shift everything until the hole so that the tricky part
watch this if doubt : https://www.youtube.com/watch?v=i-SKeOcBwko
*/

    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int hole = i;
            while (hole > 0 && arr[hole - 1] > key) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = key;
        }
        for (int e : arr)
            System.out.print(e + " ");
    }
}

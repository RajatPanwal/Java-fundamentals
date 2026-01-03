
public class arrays1 {

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 4 };

        // dynamic array, every value here is 0
        int arr2[] = new int[3];
        arr2[1] = 2;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(arr2[i]);
        }

    }

}

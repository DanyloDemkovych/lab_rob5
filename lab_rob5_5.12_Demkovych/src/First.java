public class First {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0, j = 1; i < array.length; i++, j += 2) {
            array[i] = j;
        }

        for (int i : array) {
            System.out.println(i);
        }


    }
}

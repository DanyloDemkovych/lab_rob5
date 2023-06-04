public class Sixth {
    public static void main(String[] args) {
        int[][] array1 = new int[15][];
        for (int i = 0; i < 4; i++) {
            array1[i] = new int[5];
            array1[i+4] = new int[8];
            array1[i+8] = new int[3];
            array1[i+11] = new int[9];
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) Math.round(Math.random() * 15);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Fourth {
    public static void main(String[] args) {
        int[] Array1 = new int[10];
        int[] Array2 = new int[10];

        for (int i = 0; i < 10; i++) {
            Array1[i] = (int) Math.round(Math.random() * 10);
            Array2[i] = (int) Math.round(Math.random() * 10);
        }

        int[] Array3 = new int[10];
        for (int i = 0; i < 10; i++) {
            Array3[i] = Array1[i] + Array2[i];
        }

        for (int i : Array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : Array2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : Array3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
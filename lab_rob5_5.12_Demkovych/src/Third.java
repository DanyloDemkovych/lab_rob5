public class Third {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];
        double totalArray1 = 0, totalArray2 = 0, totalArray3 = 0;
        for (int i = 0; i < 5; i++) {
            array1[i] = (int) Math.round(Math.random() * 5);
            totalArray1 += array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array2[i] = (int) Math.round(Math.random() * 5);
            totalArray2 += array2[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array3[i] = (int) Math.round(Math.random() * 5);
            totalArray3 += array3[i];
            System.out.print(array3[i] + " ");
        }

        totalArray1 /= 5;
        totalArray2 /= 5;
        totalArray3 /= 5;

        System.out.println();

        if (totalArray1 == totalArray2 && totalArray1 == totalArray3) {
            System.out.println("totalArrayOne == totalArrayTwo == totalArrayThree");
        } else if(totalArray2 > totalArray3 && totalArray2 > totalArray1) {
            System.out.println("totalArrayTwo");
        } else if(totalArray1 > totalArray2 && totalArray1 > totalArray3) {
            System.out.println("totalArrayOne");
        } else {
            System.out.println("totalArrayThree");
        }



    }
}

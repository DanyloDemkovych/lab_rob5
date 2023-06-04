public class Fifth {
    public static void main(String[] args) {
        int[] array1= new int[15];
        int counter=0;
        for(int i=0; i<array1.length; i++){
            array1[i]=(int) Math.round(Math.random()*10);
        }
        for (int i:array1) {
            if (i % 2 == 0) {
                counter++;
            }

            System.out.print(i + "");
        }
        System.out.println("\nчисло парних чисел:" + counter);
    }
}

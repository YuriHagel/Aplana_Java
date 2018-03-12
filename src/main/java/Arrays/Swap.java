package Arrays;

public class Swap {
    public static void outputSwapedArray(){
        int[] array = new int[20];
        int i, y, h;

        System.out.println("Перед тем, как я его поменяю:");
        for (i = 0; i < array.length; i++ )
            array [i] = ((int)(Math.random()*20)-10);
        for (i = 0; i < array.length; i++)
            System.out.println("array [" + i + "]=" + array[i]);
        // Найти число
        int Max = array[0];
        int MaxIndex = 0;
        for (i = 0; i < array.length; i++)
            if (array[i] > Max){
                Max = array[i];
                MaxIndex = i;
            }
        int Min = array[0];
        int MinIndex = 0;
        for (y = 0; y < array.length; y++)
            if (array[y] < Min){
                Min = array[y];
                MinIndex = y;
            }
        System.out.println("");
        System.out.println("Максимальное число " + Max + " значение [" + MaxIndex + "]");
        System.out.println("Минимальное число " + Min + " значение [" + MinIndex + "]");
        System.out.println("\nПоменять местами:\n");
        int item = array[MaxIndex];
        array[MaxIndex] = array[MinIndex];
        array[MinIndex] = item;

        for (h = 0; h < array.length; h++)
            System.out.println("array [" + h + "] = " + array[h]);



    }
}
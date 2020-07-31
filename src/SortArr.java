public class SortArr {
    public static void sortArr(){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.println(array[i]);
        }
        int max = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                max = array[i];
                break;
            }
        }
        for (; i < array.length; i++) {
            if (array[i] < 0 && array[i] > max)
                max = array[i];
        }
        System.out.println("Максимальный отрицательный элемент: " + max);
        int min = 0;
        int j;
        for (j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                min = array[j];
                break;
            }
        }
        for (; j < array.length; j++) {
            if (array[j] >= 0 && array[j] < min)
                min = array[j];
        }
        System.out.println("Минимальный положительный элемент: " + min);
    }
}

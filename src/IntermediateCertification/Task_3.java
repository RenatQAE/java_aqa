package IntermediateCertification;

public class Task_3 {
    public static void main(String[] args) {

        int[] array = {1, 5, 7, 3, 2, 0, 4, 9, 6};

        int maxElement = Integer.MIN_VALUE;
        int secondMaxElement = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {

                secondMaxElement = maxElement;
                maxElement = array[i];

            } else if (array[i] > secondMaxElement && array[i] != maxElement) {
                secondMaxElement = array[i];
            }
        }
        System.out.println("Второй по величине элемент из массива чисел это:" + secondMaxElement);
    }
}



package lesson_4;

public class hw_array_1 {
    public static void main(String[] args) {
        // ЗАДАЧА №1

        String[] toDoList = new String[5];
        toDoList[0] = "Обновить таски на сегодня";
        toDoList[1] = "Провести дейлик";
        toDoList[2] = "Заказать Пиццу для отдела";
        toDoList[3] = "Проверить выполнение задач";
        toDoList[4] = "Составить отчет";

        for (int i = 0; i < toDoList.length; i = i + 1) {
            String info = toDoList[i];
            System.out.println(info);

            System.out.println("------------------------");

            //double[] numbers = {3.14159,2.71828,1.00000};


            // ЗАДАЧА №2

            double[] numbers = new double[3];
            double v = 1.00000;
            numbers[0] = 3.14159;
            numbers[1] = 2.71828;
            numbers[2] = v;
            String result = String.format("%.5f", v);
            System.out.println("Единица: " + result);
            System.out.println("Число Пи: " + numbers[0]);
            System.out.println("Число Е: " + numbers[1]);
            System.out.println("------------------------");


        }

    }
}

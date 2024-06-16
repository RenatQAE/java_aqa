package lesson_2;

public class hw_1 {
    public static void main(String[] args) {
        // generate variable - String
        String maximaDocs = "Договор на оказание информационно-консультационных услуг";
        // println our variable
        System.out.println(maximaDocs);
        // variable + txt
        String result = maximaDocs + "-Создан!";
        // print result
        System.out.println(result);

        // Возврат длины строки ( количества символов) по примеру
        int resultLength = maximaDocs.length();
        System.out.println(resultLength);

        //  проверка строки на пустоту
        boolean result2 = maximaDocs.isEmpty();
        System.out.println(result2);

        // проверка является ли указанная ячейка пустой
        boolean result3 = maximaDocs.isBlank();
        System.out.println(result3);

        // Вывод подстроки
        String result4 = result.substring(3, 11);
        System.out.println(result4);

        //Возвращает индекс первого вхождения указанного значения в строковый объект String , на котором он был вызван
        int result5 = result.indexOf(6);
        System.out.println(result5);
        // Если строка найдена – метод возвращает номер ее первого символа, если не найдена — возвращает -1
        int result6 = result.lastIndexOf('a');
        System.out.println(result6);

        // перевод в нижний регистр
        String result7 = result.toLowerCase();
        System.out.println(result7);

        // перевод в верхний регистр
        String result8 = result.toUpperCase();
        System.out.println(result8);

        // замена символов местами "О" на "А"
        String result9 = result.replace('о', 'а');
        System.out.println(result9);

        // Определить начинается ли с выбранного текста
        boolean result10 = result.startsWith("hello");
        System.out.println(result10);

        // Определить заканчивается ли с выбранного текста
        boolean result11 = result.endsWith("-Создан!");
        System.out.println(result11);

        // повтор выбранное количество раз
        String result12 = result.repeat(4);
        System.out.println(result12);

        // Позволяющий проверить, содержит ли String другую подстроку или нет. Возвращает логическое значение
        boolean result13 = result.contains("Л");
        System.out.println(result13);

        // Склеивание строк
        String result14 = result.concat("+ha-ha-ha");
        System.out.println(result14);

        // удаление начальных и конечных пробелов
        String result15 = result.trim();
        System.out.println(result15);

        // сравнение обьектов на равенство
        boolean result16 = result.equals("на");
        System.out.println(result16);

    }
}

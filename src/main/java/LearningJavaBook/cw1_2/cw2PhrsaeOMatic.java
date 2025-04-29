package LearningJavaBook.cw1_2;

public class cw2PhrsaeOMatic {
    public static void main(String[] args) {
        // Создаем 3 набора слов для выбора
        String [] wordListOne = {"Красивая", "Умная","Милая","Строгая","Харизматичная","Назойливая", "Модная","Жопа"};
        String [] wordListTwo = {"Трудная","Легкая","Начитанная","Глупая","Веселая", "Трудолюбивая"};
        String [] wordListThree = {"Алина","Полина","Венера","Валерия","Алия", "Ангелина","Галина"};

        // Вычисляем сколько слов в каждом списке
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        // Генерируем 3 случайных числа
        int rand1 = (int)(Math.random()* oneLenght);
        int rand2 = (int)(Math.random()* twoLenght);
        int rand3 = (int)(Math.random()* threeLenght);

        // Строим фразу
        String phrase = wordListOne[rand1]+ " "+ wordListTwo[rand2]+" "+wordListThree[rand3];
        // Выводим на экран
        System.out.println("Количество в 1 массиве: "+ oneLenght+  "Во втором:" + twoLenght+"В третьем: " +threeLenght);
        System.out.println(phrase);
    }

}

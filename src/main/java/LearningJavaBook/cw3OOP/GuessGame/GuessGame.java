package LearningJavaBook.cw3OOP.GuessGame;

public class GuessGame {
    // содержит 3 переменных экземпляра для 3 обьектов Player
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        // Создаем 3 обьекта Player и присваиваем их 3 переменным экземпляра
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // объявляем 3 переменные для хранения вариантов от каждого игрока
        int gueessp1 = 0;
        int gueessp2 = 0;
        int gueessp3 = 0;

        // объявляем три переменные для хранения правильности ответов игроков
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        // Создаем число которое игроки должны угадать

        int targerNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9");

        while (true){

            // вызываем метод guess для каждого
            p1.guess();
            p2.guess();
            p3.guess();
            // Извлекаем варианты каждого игрока
            gueessp1 = p1.number;
            System.out.println("Первый игрок думает что это число "+gueessp1);

            gueessp2 = p2.number;
            System.out.println("Второй игрок думает что это число "+gueessp2);

            gueessp3 = p3.number;
            System.out.println("Третий игрок думает что это число "+gueessp3);


            // Проверяем варианты каждого игрока, если угадал присваиваем переменной IsRight = true;
          if (gueessp1 == targerNumber){
              p1IsRight = true;
          }
          if (gueessp2 == targerNumber){
              p2IsRight = true;
          }
          if (gueessp3 == targerNumber){
              p3IsRight = true;

          }
            if (p1IsRight || p2IsRight || p3IsRight){
                System.out.println("У Нас есть победитель!!!");
                System.out.println("Первый игрок угадал? "+p1IsRight);
                System.out.println("Второй игрок угадал? "+p2IsRight);
                System.out.println("Третий игрок угадал? "+p3IsRight);
                System.out.println("Конец игры!");
                // конец игры, прерываем цикл
                break;
            } else {
                System.out.println(" Игроки должны попробовать еще раз");
            }





        }
    }

}

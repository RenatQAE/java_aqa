package lesson6.Interface;

import lesson6.User;

import java.util.Scanner;

public class BalanceService {
    public static void main(String[] args) {
        User u1 = new User("Alex");
        u1.setBalance(100);
        u1.setPhone("+79872699640");
        u1.setEmail("admin@mail.ru");
        User u2 = new User("Mark");
        u2.setBalance(50);
        u2.setPhone("+79872221433");
        u2.setEmail("newuser@mail.ru");
        User u3 = new User("Inna");
        u3.setBalance(200);
        u3.setPhone("+7905021133");
        u3.setEmail("papawa2231@gmail.com");


//        String notificationType = new Scanner(System.in).nextLine();
//        SmsNotifier smsNotifier = new SmsNotifier();
//        smsNotifier.notifyUser(u1,"Ваш баланс ниже 0!");
//        EmailNotifier emailNotifier = new EmailNotifier();
//        emailNotifier.notifyUser(u1,"Ваш баланс ниже 0! ");
//        PushNotifier pushNotifier = new PushNotifier();
//        pushNotifier.notifyUser(u1,"Ваш баланс ниже 0");
//        Notifier notifier = null;
//        if (notificationType.startsWith("e")){
//            notifier = new EmailNotifier();
//
//        }
//        if (notificationType.startsWith("p")){
//            notifier  = new PushNotifier();
//
//        }
//        if (notificationType.startsWith("s")){
//            notifier = new SmsNotifier();
//            ;
//        }
//        notifier.notifyUser(u1,"Balance 0");
        Play play = new Play(new WANotifier());
        play.processUser(u1);
        play.processUser(u2);
        play.processUser(u3);

    }

}

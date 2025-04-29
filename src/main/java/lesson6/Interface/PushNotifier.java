package lesson6.Interface;

import lesson6.User;

public class PushNotifier implements Notifier{

    public void notifyUser(User user, String text){
        System.out.println("Отправляем Пушку на номер "+user.getPhone()+" : "+text);

    }
}

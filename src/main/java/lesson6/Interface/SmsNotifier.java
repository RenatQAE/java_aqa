package lesson6.Interface;

import lesson6.User;

public class SmsNotifier implements Notifier{

    public void notifyUser(User user,String text){
        System.out.println("Отправляем смс на номер "+user.getPhone()+" : "+text);
    }
}

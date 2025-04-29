package lesson6.Interface;

import lesson6.User;

public class EmailNotifier implements Notifier{

    public void notifyUser(User user, String text){
        System.out.println("Отправляем письмо на почту "+user.getEmail()+" : "+text);
    }
}

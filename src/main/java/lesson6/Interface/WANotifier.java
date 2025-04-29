package lesson6.Interface;

import lesson6.User;

public class WANotifier implements Notifier{
    @Override
    public void notifyUser(User user, String text) {
        System.out.println("Уведомляем по Whatsapp "+user.getPhone()+" : "+text);
    }
}

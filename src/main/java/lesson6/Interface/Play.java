package lesson6.Interface;

import lesson6.User;

public class Play {
    private Notifier notifier;

    public Play(Notifier notifier) {
        this.notifier = notifier;
    }
    public void processUser(User user){
        notifier.notifyUser(user,"Balance 0,00");
    }
}

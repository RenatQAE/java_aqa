package lesson11.Inheiritance;

import java.util.ArrayList;
import java.util.List;

public class vk {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        Admin admin1 = new Admin();
        Admin admin2 = new Admin();

        List<User> users = new ArrayList<>();
        List<Admin> admins = new ArrayList<>();
        users.add(user1);
        users.add(admin1);

        SuperAdmin superAdmin = new SuperAdmin();
        superAdmin.name = "Stan";
        superAdmin.sayName();
        Support support = new Support();
        support.getInfo(1);
        support.id = 1;





    }
}

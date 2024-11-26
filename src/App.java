import UI.Menus;
import Service.UserService;

public class App {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();

        userService.addAdminUser();
        userService.login();

    }
}
    
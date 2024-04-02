
import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    static Admin admin=new Admin();
    static User user=new User();
    public static void main(String[] args) {
        login();
    }
    public static void login(){
        System.out.println("Welcome to the login page:");
        System.out.println("--------------------------");
        System.out.println("Enter your username:");
        String username = scan.next();
        if (username.equals("admin")){
            System.out.println("Welcome Admin!!");
            admin.adminmenu();
        } else if (username.equals("user")) {
            System.out.println("Welcome User");
            user.usermenu();
        }
        else {
            System.out.println("Invalid username");
            login();
        }
    }
}

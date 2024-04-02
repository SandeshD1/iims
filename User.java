import java.util.Scanner;

public class User {
    Scanner scan=new Scanner(System.in);
    public void usermenu(){
        System.out.println("=================");
        System.out.println("1: View Location and temperature");
        System.out.println("2: Logout");
        System.out.println("3: Exit");
        System.out.println("=================");
        System.out.println("Enter your choice:");
        int choice=scan.nextInt();
        scan.nextLine();
        if (choice==1) {
            viewlocationandtemp();
        }else if(choice==2){
            Main.login();
        }else{
            System.out.println("Thank you for using the program.");
            System.exit(0);
        }
    }
    public void viewlocationandtemp(){
        System.out.println("========================");
        System.out.println("Location and temperature");
        System.out.println("========================");
        for (int i = 0; i < Admin.locations.size(); i++) {
            System.out.print(Admin.locations.get(i));
            System.out.println("    "+Admin.temperatures.get(i)+"`C");
        }
        usermenu();
    }
}

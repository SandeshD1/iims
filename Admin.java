import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    Scanner scan=new Scanner (System.in);
    static ArrayList<String> locations = new ArrayList<>();
    static ArrayList<Integer> temperatures= new ArrayList<>();
    public void adminmenu(){
        System.out.println("=================");
        System.out.println("1: Add Location and its temperature");
        System.out.println("2: View Location and temperature");
        System.out.println("3: Delete Location and temperature");
        System.out.println("4: Update temperature");
        System.out.println("5: Logout");
        System.out.println("6: Exit");
        System.out.println("=================");
        System.out.println("Enter your choice:");
        int choice=scan.nextInt();
        scan.nextLine();
        switch (choice) {
            case 1:
                addlocationandtemp();
                break;

            case 2:
                viewlocationandtemp();
                break;

            case 3:
                deletelocationandtemp();
                break;

            case 4:
                updatetemp();
                break;
            
            case 5:
                Main.login();
                break;

            default:
                System.out.println("Thank you for using the program.");
                System.exit(0);
                break;
        }
    }

    public void addlocationandtemp(){
        System.out.println("Enter the number of locations to add:");
        int totalLocations = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= totalLocations; i++){
            System.out.println("Enter location : " + i);
            String selectedLocation = scan.nextLine();
            locations.add(selectedLocation);
            System.out.println("Enter the temperature of the location:");
            int inputtemp=scan.nextInt();
            scan.nextLine();
            temperatures.add(inputtemp);
        }
        adminmenu();
    }

    public void viewlocationandtemp(){
        System.out.println("========================");
        System.out.println("Location and temperature");
        System.out.println("========================");
        for (int i = 0; i < locations.size(); i++) {
            System.out.print(locations.get(i));
            System.out.println("    "+temperatures.get(i)+"`C");
        }
        adminmenu();
    }

    public void deletelocationandtemp(){
        System.out.println("========================");
        System.out.println("Location and temperature");
        System.out.println("========================");
        for (int i = 0; i < locations.size(); i++) {
            System.out.println(locations.get(i)+"\t"+temperatures.get(i));
        }
        System.out.println("Enter the location to delete:");
        String deletelocation=scan.nextLine();
        int index=locations.indexOf(deletelocation);
        locations.remove(deletelocation);
        temperatures.remove(index);
        adminmenu();
    }

    public void updatetemp(){
        System.out.println("========================");
        System.out.println("Location and temperature");
        System.out.println("========================");
        for (int i = 0; i < locations.size(); i++) {
            System.out.println(locations.get(i)+"\t"+temperatures.get(i));
        }
        System.out.println("Enter the location to update its tempperature:");
        String selectlocation=scan.nextLine();
        int index=locations.indexOf(selectlocation);
        System.out.println("Enter the new temperature:");
        int newtemp=scan.nextInt();
        scan.nextLine();
        temperatures.add(index, newtemp);
        adminmenu();
    }
}

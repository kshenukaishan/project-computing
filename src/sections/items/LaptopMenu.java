package sections.items;

import model.Desktop;
import model.Laptop;
import util.MenuSetup;

import java.util.List;
import java.util.Scanner;

public class LaptopMenu {

    public static void laptopComputerSection(List<Laptop> laptops, Scanner input){

        String[] laptopMenuItems = new String[5];

        laptopMenuItems[0] = "(1) Add Computer";
        laptopMenuItems[1] = "(2) Update Computer";
        laptopMenuItems[2] = "(3) Delete Computer";
        laptopMenuItems[3] = "(4) View All Computers";
        laptopMenuItems[4] = "(5) Back";

        subMenuSection(laptops, input, laptopMenuItems);

    }

    private static void subMenuSection(List<Laptop> laptops, Scanner input, String[] menuItems){
        while (true){
            int selectedItem = MenuSetup.printMenu(menuItems, input);
            switch (selectedItem){
                case 0:
                    System.out.println("Add Computer");
                    break;
                case 1:
                    System.out.println("Update Computer");
                    break;
                case 2:
                    System.out.println("Delete Computer");
                    break;
                case 3:
                    System.out.println("View All Computers");
                    break;
                case 4:
                    System.out.println("Computers Menu");
                    return;
            }
        }
    }

}

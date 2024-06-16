package sections.items;

import model.Laptop;
import model.PcComponent;
import util.MenuSetup;

import java.util.List;
import java.util.Scanner;

public class PcComponentsMenu {

    public static void pcComponentsSection(List<PcComponent> components, Scanner input){

        String[] componentsMenuItems = new String[5];

        componentsMenuItems[0] = "(1) Add Component";
        componentsMenuItems[1] = "(2) Update Component";
        componentsMenuItems[2] = "(3) Delete Component";
        componentsMenuItems[3] = "(4) View All Components";
        componentsMenuItems[4] = "(5) Back";

        subMenuSection(components, input, componentsMenuItems);

    }

    private static void subMenuSection(List<PcComponent> components, Scanner input, String[] menuItems){
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

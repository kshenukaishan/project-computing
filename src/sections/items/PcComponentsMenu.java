package sections.items;

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
                    System.out.println("Add Component");
                    addComponent(components, input);
                    break;
                case 1:
                    System.out.println("Update Component");
                    updateComponent(components, input);
                    break;
                case 2:
                    System.out.println("Delete Component");
                    deleteComponent(components, input);
                    break;
                case 3:
                    System.out.println("View All Components");
                    viewAllComponent(components, input);
                    break;
                case 4:
                    System.out.println("Computers Menu");
                    return;
            }
        }
    }

    private static void viewAllComponent(List<PcComponent> components, Scanner input) {
        System.out.println("View all components");
    }

    private static void deleteComponent(List<PcComponent> components, Scanner input) {
        System.out.println("Delete Component");
    }

    private static void updateComponent(List<PcComponent> components, Scanner input) {
        System.out.println("Update Component");
    }

    private static void addComponent(List<PcComponent> components, Scanner input) {
        System.out.println("Add Component");
    }
}

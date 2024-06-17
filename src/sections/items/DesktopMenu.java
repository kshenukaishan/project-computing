package sections.items;

import dao.custom.impl.DesktopDaoImpl;
import model.Desktop;
import util.MenuSetup;

import java.util.List;
import java.util.Scanner;

public class DesktopMenu {

    public static void desktopComputerSection(List<Desktop> desktops, Scanner input){

        String[] desktopMenuItems = new String[5];

        desktopMenuItems[0] = "(1) Add Computer";
        desktopMenuItems[1] = "(2) Update Computer";
        desktopMenuItems[2] = "(3) Delete Computer";
        desktopMenuItems[3] = "(4) View All Computers";
        desktopMenuItems[4] = "(5) Back";

        subMenuSection(desktops, input, desktopMenuItems);

    }

    private static void subMenuSection(List<Desktop> desktops, Scanner input, String[] menuItems){
        while (true){
            int selectedItem = MenuSetup.printMenu(menuItems, input);
            switch (selectedItem){
                case 0:
                    System.out.println("Add Computer");
                    new DesktopDaoImpl().add(desktops, input);
                    break;
                case 1:
                    System.out.println("Update Computer");
                    updateComputer(desktops, input);
                    break;
                case 2:
                    System.out.println("Delete Computer");
                    deleteComputer(desktops, input);
                    break;
                case 3:
                    System.out.println("View All Computers");
                    new DesktopDaoImpl().viewAll(desktops);
                    break;
                case 4:
                    System.out.println("Computers Menu");
                    return;
            }

        }
    }

    private static void viewAllComputers(List<Desktop> desktops, Scanner input) {
        System.out.println("View all computers");
    }

    private static void deleteComputer(List<Desktop> desktops, Scanner input) {
        System.out.println("Delete Computer");
    }

    private static void updateComputer(List<Desktop> desktops, Scanner input) {
        System.out.println("Update Computer");
    }

    private static void addComputer(List<Desktop> desktops, Scanner input) {
        System.out.println("Add Computer");
    }
}

package sections.items;

import model.Desktop;
import model.Laptop;
import util.MenuSetup;

import java.util.List;
import java.util.Scanner;

public class LaptopMenu {

    public static void laptopComputerSection(List<Laptop> laptops, Scanner input){

        String[] laptopMenuItems = new String[5];

        laptopMenuItems[0] = "(1) Add Laptop";
        laptopMenuItems[1] = "(2) Update Laptop";
        laptopMenuItems[2] = "(3) Delete Laptop";
        laptopMenuItems[3] = "(4) View All Laptops";
        laptopMenuItems[4] = "(5) Back";

        subMenuSection(laptops, input, laptopMenuItems);

    }

    private static void subMenuSection(List<Laptop> laptops, Scanner input, String[] menuItems){
        while (true){
            int selectedItem = MenuSetup.printMenu(menuItems, input);
            switch (selectedItem){
                case 0:
                    System.out.println("Add Laptop");
                    addLaptop(laptops, input);
                    break;
                case 1:
                    System.out.println("Update Laptop");
                    updateLaptop(laptops, input);
                    break;
                case 2:
                    System.out.println("Delete Laptop");
                    deleteLaptop(laptops, input);
                    break;
                case 3:
                    System.out.println("View All Laptops");
                    viewAllLaptops(laptops, input);
                    break;
                case 4:
                    System.out.println("Computers Menu");
                    return;
            }
        }
    }

    private static void viewAllLaptops(List<Laptop> laptops, Scanner input) {
        System.out.println("View all laptops");
    }

    private static void deleteLaptop(List<Laptop> laptops, Scanner input) {
        System.out.println("Delete Laptop");
    }

    private static void updateLaptop(List<Laptop> laptops, Scanner input) {
        System.out.println("Update Laptop");
    }

    private static void addLaptop(List<Laptop> laptops, Scanner input) {
        System.out.println("Add laptop");
    }

}

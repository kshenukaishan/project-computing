package sections;

import model.Desktop;
import model.Laptop;
import model.PcComponent;
import sections.items.DesktopMenu;
import sections.items.LaptopMenu;
import sections.items.PcComponentsMenu;
import util.MenuSetup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputersMenu {

    public static void computersSection(Scanner input){

        String[] computerMenuItems = new String[5];

        computerMenuItems[0] = "(1) Desktop Section";
        computerMenuItems[1] = "(2) Laptop Section";
        computerMenuItems[2] = "(3) Other PC Components";
        computerMenuItems[3] = "(4) Back";

        subMenuSection(input, computerMenuItems);

    }

    private static void subMenuSection(Scanner input, String[] computerMenuItems){

        List<Desktop> desktops = new ArrayList<>();
        List<Laptop> laptops = new ArrayList<>();
        List<PcComponent> pcComponents = new ArrayList<>();

        while (true){

            int selectedItem = MenuSetup.printMenu(computerMenuItems, input);

            switch (selectedItem){
                case 0:
                    System.out.println("Desktop Computers");
                    DesktopMenu.desktopComputerSection(desktops, input);
                    break;
                case 1:
                    System.out.println("Laptop Computers");
                    LaptopMenu.laptopComputerSection(laptops, input);
                    break;
                case 2:
                    System.out.println("PC Components");
                    PcComponentsMenu.pcComponentsSection(pcComponents, input);
                    break;
                case 3:
                    System.out.println("Main Menu");
                    return;
            }
        }
    }
}

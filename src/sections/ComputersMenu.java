package sections;

import model.Desktop;
import model.Laptop;
import model.PcComponents;
import util.MenuSetup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputersMenu {

    public static void computersSection(Scanner input){

        List<Desktop> desktops = new ArrayList<>();
        List<Laptop> laptops = new ArrayList<>();
        List<PcComponents> pcComponents = new ArrayList<>();

        String[] computerMenuItems = new String[5];

        computerMenuItems[0] = "(1) Desktop Section";
        computerMenuItems[1] = "(2) Laptop Section";
        computerMenuItems[2] = "(3) Other PC Components";
        computerMenuItems[3] = "(5) Back";

        subMenuSection(input, computerMenuItems);

    }

    private static void subMenuSection(Scanner input, String[] computerMenuItems){
        while (true){

            int selectedItem = MenuSetup.printMenu(computerMenuItems, input);

            switch (selectedItem){
                case 0:
                    System.out.println("Desktop Computers");
                    break;
                case 1:
                    System.out.println("Laptop Computers");
                    break;
                case 2:
                    System.out.println("Other PC Components");
                    break;
                case 3:
                    System.out.println("Main Menu");
                    return;
            }
        }
    }
}

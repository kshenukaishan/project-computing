package sections.items;

import model.Desktop;

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

    }

}

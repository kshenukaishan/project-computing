package sections;

import model.*;
import util.MenuSetup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public static void mainMenuSection(Scanner input){

        String[] menuItems = new String[5];
        menuItems[0] = "(1) Repair Orders Menu";
        menuItems[1] = "(2) PC Inventory/Components";
        menuItems[2] = "(3) Purchase Order Menu";
        menuItems[3] = "(4) Payments Menu";
        menuItems[4] = "(5) Exit";

        subMenuSection(menuItems, input);

    }

    public static int subMenuSection(String[] menuItems, Scanner input){

        List<Payment> payments = new ArrayList<>();
        List<PurchaseOrder> purchaseOrders = new ArrayList<>();
        List<RepairOrder> repairOrders = new ArrayList<>();

        while (true){

            int selectedItem = MenuSetup.printMenu(menuItems, input);

            switch (selectedItem){
                case 0:
                    System.out.println("Repair Orders Menu");
                    RepairOrdersMenu.repairOrderSection(repairOrders,input);
                    break;
                case 1:
                    System.out.println("PC Inventory Menu");
                    break;
                case 2:
                    System.out.println("Purchase Orders Menu");
                    PurchaseOrdersMenu.purchaseOrderSection(purchaseOrders, input);
                    break;
                case 3:
                    System.out.println("Payments Menu");
                    PaymentsMenu.paymentsSection(payments, input);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
                    break;
            }
        }
    }
}

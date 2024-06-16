package sections;

import model.PurchaseOrder;
import util.MenuSetup;

import java.util.List;
import java.util.Scanner;


public class PurchaseOrdersMenu {

    public static void purchaseOrderSection(List<PurchaseOrder> purchaseOrders, Scanner input){

        String[] repairOrderMenuItems = new String[6];

        repairOrderMenuItems[0] = "(1) Add Order";
        repairOrderMenuItems[1] = "(2) Find Order";
        repairOrderMenuItems[2] = "(3) Update Order";
        repairOrderMenuItems[3] = "(4) Delete Order";
        repairOrderMenuItems[4] = "(5) View All Orders";
        repairOrderMenuItems[5] = "(6) Back";

        subMenuSection(purchaseOrders, input, repairOrderMenuItems);

    }

    private static void subMenuSection(List<PurchaseOrder> purchaseOrders, Scanner input, String[] menuItems){
        while(true){
            int selectedItem = MenuSetup.printMenu(menuItems, input);

            switch (selectedItem){
                case 0:
                    addPurchaseOrder(purchaseOrders, input);
                    break;
                case 1:
                    findPurchaseOrder(purchaseOrders, input);
                    break;
                case 2:
                    updatePurchaseOrder(purchaseOrders, input);
                    break;
                case 3:
                    deletePurchaseOrder(purchaseOrders, input);
                    break;
                case 4:
                    viewPurchaseOrders(purchaseOrders, input);
                    break;
                case 5:
                    System.out.println("Main Menu");
                    return;
            }
        }
    }

    private static void viewPurchaseOrders(List<PurchaseOrder> purchaseOrders, Scanner input) {
        System.out.println("View all orders");
    }

    private static void deletePurchaseOrder(List<PurchaseOrder> purchaseOrders, Scanner input) {
        System.out.println("Delete Order");
    }

    private static void updatePurchaseOrder(List<PurchaseOrder> purchaseOrders, Scanner input) {
        System.out.println("Update Order");
    }

    private static void findPurchaseOrder(List<PurchaseOrder> purchaseOrders, Scanner input) {
        System.out.println("Find Order");
    }

    private static void addPurchaseOrder(List<PurchaseOrder> purchaseOrders, Scanner input) {
        System.out.println("Add Orders");
    }
}
